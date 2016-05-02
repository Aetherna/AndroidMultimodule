package com.example;

import javax.inject.Inject;

public class Presenter {

   private UseCase useCase;

    @Inject
    public Presenter(UseCase useCase) {
        this.useCase = useCase;
    }
}
