package com.example.android.tourguideapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HistoricalSitesFragment();
        } else {
            return new HotelFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_events);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.category_historical);
        } else {
            return mContext.getString(R.string.category_hotels);
        }
    }
}
