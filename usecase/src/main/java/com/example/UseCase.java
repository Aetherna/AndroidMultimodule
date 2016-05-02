package com.example;

import javax.inject.Inject;

public class UseCase {

    private RepoBase repo;

    @Inject
    public UseCase(RepoBase repo) {
        this.repo = repo;
    }
}
