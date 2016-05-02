package com.example;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Module
public class UseCaseModule {

    @Provides
    UseCase providesUseCase(RepoBase repo) {
        return new UseCase(repo);
    }

}
