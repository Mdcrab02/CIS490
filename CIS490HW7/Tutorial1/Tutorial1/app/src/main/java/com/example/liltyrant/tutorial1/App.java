package com.example.liltyrant.tutorial1;

import android.app.Application;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by LilTyrant on 11/9/2015.
 */
public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, cKP6tRnIKNfSdQ5jQaWWAFYhBYvJIlFY8rdK54xP, MuK46LvpMEBhdeQJauC1BfBPTbqyvGDO2YK7jWfg); // Your Application ID and Client Key are defined elsewhere
    }
}
