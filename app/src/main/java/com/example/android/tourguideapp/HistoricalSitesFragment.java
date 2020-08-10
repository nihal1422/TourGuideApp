package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalSitesFragment extends Fragment {

    public HistoricalSitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.drawable.mahabodhi,R.string.site_mahabodhi,R.string.place_bodh,R.string.history_shunga));
        locations.add(new Location(R.drawable.shanti,R.string.site_shanti, R.string.place_rajgir,R.string.history_modern));
        locations.add(new Location(R.drawable.nalandauniversity,R.string.site_nalanda,R.string.place_nalanda,R.string.history_century));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.historical_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}