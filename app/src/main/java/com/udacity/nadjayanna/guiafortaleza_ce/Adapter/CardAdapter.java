package com.udacity.nadjayanna.guiafortaleza_ce.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.udacity.nadjayanna.guiafortaleza_ce.Model.Card;
import com.udacity.nadjayanna.guiafortaleza_ce.R;

import java.util.List;

/**
 * Created by nadja on 25/08/2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private List<Card> mCardsList;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitulo;
        public ImageView mImagem;

        public ViewHolder(View v) {
            super(v);
            mTitulo = (TextView) v.findViewById(R.id.info_text);;
            mImagem = (ImageView) v.findViewById(R.id.card_image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CardAdapter(List<Card> myDataset) {
        mCardsList = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTitulo.setText(mCardsList.get(position).getmName());
        holder.mImagem.setImageResource(mCardsList.get(position).getmImageId());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mCardsList.size();
    }
}
