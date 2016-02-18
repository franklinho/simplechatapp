package com.franklinho.codepathsimplechatapp;

import android.app.Application;

import com.franklinho.codepathsimplechatapp.models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by franklinho on 2/17/16.
 */
public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Message.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("simplechatclient")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://codepathsimplechatlab.herokuapp.com/parse/").build());

    }
}
