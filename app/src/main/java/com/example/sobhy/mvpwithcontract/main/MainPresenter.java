package com.example.sobhy.mvpwithcontract.main;

/**
 * Responsible for handling action from view and
 * updating the ui as required
 */

public class MainPresenter implements MainContract.Presenter {

    MainContract.MVPview view;

    public MainPresenter(MainContract.MVPview view) {
        this.view = view;
    }

    @Override
    public void HandleSignInButtonClick() {
        view.ShowSignInScreen();
    }

    @Override
    public void HandleSignOutButtonClick() {
        view.ShowSignOutScreen();
    }
}
