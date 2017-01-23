package com.example.kiit.mypager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kiit on 23-11-2016.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context1;
    int PRIVATE_MODE=0;
    private static final String PREF_NAME="Welcome";
    private static final String LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        context1 = context;
        pref=context1.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor=pref.edit();
    }
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(LAUNCH, true);
    }
}
