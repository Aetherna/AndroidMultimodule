package com.aethernadev.repo;

import android.content.Context;

import com.example.RepoBase;

import javax.inject.Inject;

/**
 * Created by Aetherna on 2016-05-02.
 */
public class Repo implements RepoBase {

    private Context context;

    @Inject
    public Repo(Context context) {
        this.context = context;
    }
}
