package com.example.android.quakereport;

/**
 * Created by hp on 09-05-2017.
 */


/**
 * Created by hp on 08-05-2017.
 */

public class Quake {

    private String mMagnitude;
    private String mCity;
    private String mDate;

    public Quake (String Magnitude, String City, String Date ) {

        mMagnitude= Magnitude;
        mCity= City;
        mDate= Date;
    }


    public String getMagnitude () {

        return mMagnitude;
    }

    public String getCity () {

        return mCity;
    }

    public String getDate () {

        return mDate;
    }

}
