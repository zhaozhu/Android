package com.example.zzpro.startcontext;

import android.app.Application;

/**
 * Created by zzpro on 2017/8/23.
 */

public class App extends Application{
    private String textData="default";

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }
}
