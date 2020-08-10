package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentLocation.getPlace());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        if (currentLocation.hasRestaurantName()) {
            nameTextView.setText(currentLocation.getRestaurantsName());
            nameTextView.setVisibility(View.VISIBLE);
        } else {
            nameTextView.setVisibility(View.GONE);
        }

        TextView hotelTextView = (TextView) listItemView.findViewById(R.id.hotel_text_view);
        if (currentLocation.hasHotelName()) {
            hotelTextView.setText(currentLocation.getHotelName());
            hotelTextView.setVisibility(View.VISIBLE);
        } else {
            hotelTextView.setVisibility(View.GONE);
        }

        TextView basePriceTextView = (TextView) listItemView.findViewById(R.id.basePrice);
        if (currentLocation.hasHotelBasePrice()) {
            basePriceTextView.setText(currentLocation.getHotelBasePrice());
            basePriceTextView.setVisibility(View.VISIBLE);
        } else {
            basePriceTextView.setVisibility(View.GONE);
        }

        TextView eventTextView = (TextView) listItemView.findViewById(R.id.eventTextView);
        if (currentLocation.hasEventName()) {
            eventTextView.setText(currentLocation.getEventName());
            eventTextView.setVisibility(View.VISIBLE);
        } else {
            eventTextView.setVisibility(View.GONE);
        }

        TextView historicalTextView = (TextView) listItemView.findViewById(R.id.historical_text_view);
        if (currentLocation.hasHistoricalSiteName()) {
            historicalTextView.setText(currentLocation.getHistoricalSiteName());
            historicalTextView.setVisibility(View.VISIBLE);
        } else {
            historicalTextView.setVisibility(View.GONE);
        }

        TextView builtTextView = (TextView) listItemView.findViewById(R.id.builtTextView);
        if (currentLocation.hasBuiltYear()) {
            builtTextView.setText(currentLocation.getBuiltYear());
            builtTextView.setVisibility(View.VISIBLE);
        } else {
            builtTextView.setVisibility(View.GONE);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageOf);
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
