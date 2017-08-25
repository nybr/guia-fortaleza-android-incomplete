package com.udacity.nadjayanna.guiafortaleza_ce.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.nadjayanna.guiafortaleza_ce.Adapter.CardAdapter;
import com.udacity.nadjayanna.guiafortaleza_ce.Model.Card;
import com.udacity.nadjayanna.guiafortaleza_ce.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PontosInteresseFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public PontosInteresseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cards_conteiner, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cards_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("Planetário Rubens de Azevedo",  R.drawable.planetario));
        cards.add(new Card("TESTE", R.drawable.planetario));

        // specify an adapter (see also next example)
        mAdapter = new CardAdapter(cards);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;

    }

}
