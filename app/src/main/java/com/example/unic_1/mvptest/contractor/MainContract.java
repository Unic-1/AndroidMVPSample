package com.example.unic_1.mvptest.contractor;

import android.view.View;

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
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);
    }
}
