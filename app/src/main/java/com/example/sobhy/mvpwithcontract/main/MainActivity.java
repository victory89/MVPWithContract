package com.example.sobhy.mvpwithcontract.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sobhy.mvpwithcontract.R;

public class MainActivity extends AppCompatActivity implements MainContract.MVPview {

    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }
}
