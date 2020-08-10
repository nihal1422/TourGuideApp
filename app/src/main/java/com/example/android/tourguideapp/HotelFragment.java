package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.drawable.maurya,R.string.hotel_maurya, R.string.place_gandhi,R.string.price_3));
        locations.add(new Location(R.drawable.chanakya,R.string.hotel_chanakya, R.string.place_block,R.string.price_5));
        locations.add(new Location(R.drawable.vatika, R.string.hotel_vatika,R.string.place_road,R.string.price_4));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.hotel_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}