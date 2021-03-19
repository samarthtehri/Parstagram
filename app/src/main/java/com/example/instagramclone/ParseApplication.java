package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("v4HssvDwtL66l6rXfsO6UqSSCjVASwiUMsfZ4yyf")
                .clientKey("iTyFB8bGlThDrR7N1EszdnUJSksNwyN1i6SAgK56")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
