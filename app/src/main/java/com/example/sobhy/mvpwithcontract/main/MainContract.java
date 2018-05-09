package com.example.sobhy.mvpwithcontract.main;

/**
 * define the contract between view {@link MainActivity} and presenter {@link MainPresenter}
 */

public interface MainContract {

    interface MVPview
   {
        void ShowSignInScreen();
        void ShowSignOutScreen();
   }
     interface Presenter
    {
        void HandleSignInButtonClick();
        void HandleSignOutButtonClick();
    }
}
