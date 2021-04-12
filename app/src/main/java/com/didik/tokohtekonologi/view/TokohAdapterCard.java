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

public class TokohAdapterCard extends RecyclerView.Adapter<TokohAdapterCard.CardViewViewHolder>{
    private ArrayList<Tokoh> listTokoh;
    private Context context;

    public TokohAdapterCard(Context context) {
        this.context = context;
    }

    public ArrayList<Tokoh> getListTokoh() {
        return listTokoh;
    }

    public void setListTokoh(ArrayList<Tokoh> listTokoh) {
        this.listTokoh = listTokoh;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_card, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {

        Tokoh p = getListTokoh().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.tPhoto);

        holder.tName.setText(p.getName());
        holder.tRemarks.setText(p.getRemarks());
    }

    @Override
    public int getItemCount() {
        return getListTokoh().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView tPhoto;
        TextView tName, tRemarks;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            tPhoto = (ImageView)itemView.findViewById(R.id.item_img);
            tName = (TextView)itemView.findViewById(R.id.item_name);
            tRemarks = (TextView)itemView.findViewById(R.id.item_remarks);
        }
    }
}