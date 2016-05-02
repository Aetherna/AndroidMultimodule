package com.aethernadev.repo;

import android.content.Context;

import com.example.RepoBase;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Module
public class RepoModule {

    @Provides
    RepoBase provideRepo(Context context) {
        return new Repo(context);
    }
}
