package com.aethernadev.dagger2multimodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.Presenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AwesumApp)getApplication()).getAppComponent().inject(this);

    }
}
