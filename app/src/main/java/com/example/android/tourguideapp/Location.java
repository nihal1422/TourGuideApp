package com.example.android.tourguideapp;

public class Location {

    private int mPlace;

    private int mEventName = NO_EVENT_NAME_PROVIDED;

    private int mRestaurantsName = NO_RESTAURANT_NAME_PROVIDED;

    private int mHotelName = NO_HOTEL_NAME_PROVIDED;

    private int mHotelBasePrice = NO_HOTEL_BASEPRICE_PROVIDED;



    private int mHistoricalSiteName = NO_HISTORICAL_SITE_PROVIDED;

    private int mHistoricalPeriod = NO_HISTORICAL_PERIOD_PROVIDED;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private static final int NO_RESTAURANT_NAME_PROVIDED = -1;

    private static final int NO_HISTORICAL_SITE_PROVIDED = -1;

    private static final int NO_HOTEL_NAME_PROVIDED = -1;

    private static final int NO_HOTEL_BASEPRICE_PROVIDED = -1;

    private static final int NO_HISTORICAL_PERIOD_PROVIDED = -1;

    private static final int NO_EVENT_NAME_PROVIDED = -1;


    public Location(int eventName,int place) {
        mEventName = eventName;
        mPlace = place;
    }
    public Location(int imageResourceId,int restaurantsName,int place) {
        mImageResourceId = imageResourceId;
        mRestaurantsName = restaurantsName;
        mPlace = place;
    }
    public Location(int imageResourceId,int historicalSiteName,int place,int historicalPeriod) {
        mImageResourceId = imageResourceId;
        mHistoricalSiteName = historicalSiteName;
        mPlace = place;
        mHistoricalPeriod = historicalPeriod;
    }

    public int getEventName() {
        return mEventName;
    }
    public int getPlace() {
        return mPlace;
    }
    public int getHotelName() {
        return mHotelName;
    }
    public int getHotelBasePrice() {
        return mHotelBasePrice;
    }
    public int getRestaurantsName() {
        return mRestaurantsName;
    }
    public int getHistoricalSiteName() {
        return mHistoricalSiteName;
    }
    public int getBuiltYear() {
        return mHistoricalPeriod;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasRestaurantName() {
        return mRestaurantsName != NO_RESTAURANT_NAME_PROVIDED;
    }

    public boolean hasEventName() {
        return mEventName != NO_EVENT_NAME_PROVIDED;
    }

    public boolean hasHistoricalSiteName() {
        return mHistoricalSiteName != NO_HISTORICAL_SITE_PROVIDED;
    }
    public boolean hasHotelName() {
        return mHotelName != NO_HOTEL_NAME_PROVIDED;
    }
    public boolean hasHotelBasePrice() {
        return mHotelBasePrice != NO_HOTEL_BASEPRICE_PROVIDED;
    }

    public boolean hasBuiltYear() {
        return mHistoricalPeriod != NO_HISTORICAL_PERIOD_PROVIDED;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
