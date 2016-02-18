package com.franklinho.codepathsimplechatapp.models;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by franklinho on 2/17/16.
 */
@ParseClassName("Message")
public class Message extends ParseObject {
    public static String getUserId() {
        return USER_ID_KEY;
    }

    public static String getBody() {
        return BODY_KEY;
    }

    public static final String USER_ID_KEY = "userId";
    public static final String BODY_KEY = "body";

    public void setUserId(String userId) {
        put(USER_ID_KEY, userId);
    }

    public void setBody(String body) {
        put(BODY_KEY, body);
    }




}
