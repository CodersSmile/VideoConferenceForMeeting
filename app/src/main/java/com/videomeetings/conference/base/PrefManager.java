package com.videomeetings.conference.base;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {


    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "livevideocall";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String IS_FIRST_TIME_INFO = "IsFirstTimeInfo";
    private static final String PROFILE_ID = "ProfileId";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
    public void setFirstTimeDetail(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_INFO, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeDetail() {
        return pref.getBoolean(IS_FIRST_TIME_INFO, true);
    }
    public void setUniqId(String str) {
        editor.putString(PROFILE_ID, str);
        editor.commit();
    }

    public String getUniqId() {
        return pref.getString(PROFILE_ID, "null");
    }

    public void setBoolean(String dnd, boolean checked) {
        editor.putBoolean(dnd, checked);
        editor.commit();
    }
    public boolean getBoolean(String key) {
        return pref.getBoolean(key, false);
    }
    public boolean gettrueBoolean(String key) {
        return pref.getBoolean(key, true);
    }
}
