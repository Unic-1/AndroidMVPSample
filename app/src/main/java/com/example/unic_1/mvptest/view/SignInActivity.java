package com.example.unic_1.mvptest.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.unic_1.mvptest.contractor.SignInContract;

public class SignInActivity extends AppCompatActivity implements SignInContract.SignInView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
