package com.example;

import dagger.Subcomponent;

/**
 * Created by Aetherna on 2016-05-02.
 */
@Subcomponent(modules = PresenterModule.class)
public interface PresenterSubComponent {

    Presenter repoPresenter();

    UseCaseSubComponent useCaseComponent();

}
