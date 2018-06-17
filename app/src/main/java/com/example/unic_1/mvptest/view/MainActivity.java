package com.example.unic_1.mvptest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.unic_1.mvptest.R;
import com.example.unic_1.mvptest.contractor.MainContract;
import com.example.unic_1.mvptest.presenter.MainPresenter;

/**
 * Display the main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    MainContract.MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }
}
