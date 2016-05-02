package com.aethernadev.dagger2multimodules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
