package com.ekasilabalexcdtb.earthquake;

/**
 * Created by eKasiLab Alex CDTB on 07 Dec 2017.
 */

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(Double magnitude , String location , long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public Double getMagnitude()
    {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public long getTimeInMilliseconds()
    {
        return mTimeInMilliseconds;
    }

    public String getUrl()
    {
        return mUrl;
    }



}

