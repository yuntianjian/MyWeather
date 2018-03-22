package com.yyytj.myweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * ---------------------------
 *
 * @athor： yyytj
 * @date： 2018/3/19
 * @version：1.0
 * @describe：
 * @Modify the history：
 * ---------------------------
 */
public class MyApplication extends Application {

    private Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        // 数据库框架初始化
        LitePal.initialize(this);
        mContext = this;
    }

    // 获取全局Content
    public Context getContent() {
        return mContext;
    }
}
