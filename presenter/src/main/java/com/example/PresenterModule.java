package com.example;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Module
public class PresenterModule {

    @Provides
    Presenter providesRepoPresenter(UseCase useCase) {
        return new Presenter(useCase);
    }
}
