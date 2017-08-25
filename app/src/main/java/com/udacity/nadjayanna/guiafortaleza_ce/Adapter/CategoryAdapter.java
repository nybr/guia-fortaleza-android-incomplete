package com.udacity.nadjayanna.guiafortaleza_ce.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udacity.nadjayanna.guiafortaleza_ce.Fragment.MuseusFragment;
import com.udacity.nadjayanna.guiafortaleza_ce.Fragment.PontosInteresseFragment;
import com.udacity.nadjayanna.guiafortaleza_ce.Fragment.TeatrosFragment;
import com.udacity.nadjayanna.guiafortaleza_ce.Fragment.VidaNoturnaFragment;
import com.udacity.nadjayanna.guiafortaleza_ce.R;

/**
 * Created by nadja on 25/08/2017.
 */

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link .model.Card} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PontosInteresseFragment();
        } else if (position == 1) {
            return new MuseusFragment();
        } else if (position == 2) {
            return new TeatrosFragment();
        } else {
            return new VidaNoturnaFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_interesses);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museus);
        } else if (position == 2) {
            return mContext.getString(R.string.category_teatros);
        } else {
            return mContext.getString(R.string.category_noturna);
        }
    }
}
