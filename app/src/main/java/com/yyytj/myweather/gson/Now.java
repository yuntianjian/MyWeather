package com.yyytj.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ---------------------------
 *
 * @athor： yyytj
 * @date： 2018/3/19
 * @version：1.0
 * @describe： 现在
 * @Modify the history：
 * ---------------------------
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
