package com.didik.tokohtekonologi.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.didik.tokohtekonologi.R;
import com.didik.tokohtekonologi.data.Tokoh;

import java.util.ArrayList;

public class TokohAdapter extends RecyclerView.Adapter<TokohAdapter.CategoryViewHolder> {

    private Context context;
    public ArrayList<Tokoh> getListTokoh() {
        return listTokoh;
    }

    public void setListTokoh(ArrayList<Tokoh> listTokoh) {
        this.listTokoh = listTokoh;
    }

    private ArrayList<Tokoh>listTokoh;

    public TokohAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        holder.tName.setText(getListTokoh().get(position).getName());
        holder.tRemarks.setText(getListTokoh().get(position).getRemarks());

        Glide.with(context)
                .load(getListTokoh().get(position).getPhoto())
                .override(50, 50)
                .crossFade()
                .into(holder.tPhoto);
    }

    @Override
    public int getItemCount() {
        return getListTokoh().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tName;
        TextView tRemarks;
        ImageView tPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tName = (TextView)itemView.findViewById(R.id.item_name);
            tRemarks = (TextView)itemView.findViewById(R.id.item_remarks);
            tPhoto = (ImageView)itemView.findViewById(R.id.item_img);
        }
    }
}
