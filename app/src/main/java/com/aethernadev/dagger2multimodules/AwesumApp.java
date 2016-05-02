package com.aethernadev.dagger2multimodules;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

/**
 * Created by Aetherna on 2016-05-02.
 */
public class AwesumApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @VisibleForTesting
    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }
}
