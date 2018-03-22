package com.yyytj.myweather.utils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * ---------------------------
 *
 * @athor： yyytj
 * @date： 2018/3/19
 * @version：1.0
 * @describe： 网络请求工具类
 * @Modify the history：
 * ---------------------------
 */
public class HttpUtil {

    /**
     * 发送请求
     *
     * @param address  地址
     * @param callback 请求回调
     */
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
