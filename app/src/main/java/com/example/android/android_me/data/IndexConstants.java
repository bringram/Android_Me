package com.example.android.android_me.data;

public enum IndexConstants {

    HEAD_INDEX("head_index"),
    BODY_INDEX("body_index"),
    LEG_INDEX("leg_index");

    private String key;

    IndexConstants(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
