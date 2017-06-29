package com.liuweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/6/29.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherIdCode() {
        return weatherId;
    }

    public void setWeatherIdCode(int countyCode) {
        this.weatherId = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
