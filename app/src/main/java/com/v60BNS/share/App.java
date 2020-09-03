package com.v60BNS.share;


import android.content.Context;

import androidx.multidex.MultiDexApplication;

import com.v60BNS.language.Language;


public class App extends MultiDexApplication {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(Language.updateResources(base,Language.getLanguage(base)));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.setDefaultFont(this, "DEFAULT", "fonts/ar_font.ttf");
        TypefaceUtil.setDefaultFont(this, "MONOSPACE", "fonts/ar_font.ttf");
        TypefaceUtil.setDefaultFont(this, "SERIF", "fonts/ar_font.ttf");
        TypefaceUtil.setDefaultFont(this, "SANS_SERIF", "fonts/ar_font.ttf");

    }
}

