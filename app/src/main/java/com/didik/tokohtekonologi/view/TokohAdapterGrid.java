package com.didik.tokohtekonologi.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.didik.tokohtekonologi.R;
import com.didik.tokohtekonologi.data.Tokoh;

import java.util.ArrayList;

public class TokohAdapterGrid extends RecyclerView.Adapter<TokohAdapterGrid.GridViewHolder> {

    private Context context;
    private ArrayList<Tokoh>listTokoh;

    public ArrayList<Tokoh> getListTokoh() {
        return listTokoh;
    }

    public void setListTokoh(ArrayList<Tokoh> listTokoh) {
        this.listTokoh = listTokoh;
    }

    public TokohAdapterGrid(Context context) {
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_grid, parent, false);
        GridViewHolder gridViewHolder = new GridViewHolder(view);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListTokoh().get(position).getPhoto())
                .override(350, 550)
                .into(holder.tPhoto);
    }

    @Override
    public int getItemCount() {
        return getListTokoh().size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView tPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            tPhoto = (ImageView)itemView.findViewById(R.id.item_img);
        }
    }

}
