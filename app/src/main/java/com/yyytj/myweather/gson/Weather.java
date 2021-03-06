package com.yyytj.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ---------------------------
 *
 * @athor： yyytj
 * @date： 2018/3/19
 * @version：1.0
 * @describe： 天气
 * @Modify the history：
 * ---------------------------
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
