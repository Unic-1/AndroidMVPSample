package com.example.unic_1.mvptest.contractor;

/**
 * Define the contract between the View {@link com.example.unic_1.mvptest.view.MainActivity}
 * and the Presenter {@link MainPresenter}
 */
public interface MainContract {

    interface MainView {
        void showSignInScreen();

        void showSignUpScreen();
    }

    interface MainPresenter {
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}
