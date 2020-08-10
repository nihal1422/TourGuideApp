package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.drawable.yellow_chilly,R.string.restaurant_yellow, R.string.place_dak));
        locations.add(new Location(R.drawable.mainland,R.string.restaurant_china,R.string.place_central));
        locations.add(new Location(R.drawable.pind,R.string.restaurant_pind, R.string.place_biskoman));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.restaurants_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}