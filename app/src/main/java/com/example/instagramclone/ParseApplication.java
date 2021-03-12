package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("q99KWaTMad4OIbHi1hcQ4f8v8ylx96YYXpjPexVd")
                .clientKey("COOSnNYxx0NKTUK1Gsz3rW9iuf7z0JfWvekIR6J4")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
