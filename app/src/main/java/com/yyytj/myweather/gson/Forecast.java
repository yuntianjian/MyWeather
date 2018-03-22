package com.yyytj.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ---------------------------
 *
 * @athor： yyytj
 * @date： 2018/3/19
 * @version：1.0
 * @describe： 预测
 * @Modify the history：
 * ---------------------------
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature mTemperature;

    @SerializedName("cond")
    public More mMore;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
