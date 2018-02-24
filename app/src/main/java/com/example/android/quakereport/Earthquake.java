package com.example.android.quakereport;

/**
 * Created by abc on 11/11/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mUrl;


    private String mLocation;
    private Long mDate;
    public Earthquake(double magnitude,String location,Long date,String url)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
        mUrl=url;
    }

    public double getMagnitude()
    {
        return mMagnitude;
    }
    public String getLocation()
    {
        return mLocation;
    }
    public Long getTimeInMilliseconds()
    {return mDate;}
    public String getUrl() {
        return mUrl;
    }


}
