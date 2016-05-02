package com.aethernadev.dagger2multimodules;

import com.aethernadev.repo.RepoModule;
import com.example.PresenterSubComponent;

import dagger.Component;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Component(modules = {
        AppModule.class,
        RepoModule.class
})
public interface AppComponent {

    void inject(MainActivity mainActivity);

    PresenterSubComponent presenterSubComponent();
}
