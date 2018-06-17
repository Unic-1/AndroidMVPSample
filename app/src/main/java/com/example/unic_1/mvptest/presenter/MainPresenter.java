package com.example.unic_1.mvptest.presenter;

import com.example.unic_1.mvptest.contractor.MainContract;

/**
 * Responsible for handling actions from the View and updating the UI as required
 */

public class MainPresenter implements MainContract.MainPresenter {
    private MainContract.MainView mView;

    public MainPresenter(MainContract.MainView view) {
        mView = view;
    }
}
