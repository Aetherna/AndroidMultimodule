package com.example;

import dagger.Subcomponent;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Subcomponent(modules = UseCaseModule.class)
public interface UseCaseSubComponent {
    UseCase getUseCase();
}
