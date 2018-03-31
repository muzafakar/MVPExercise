package com.zulfakarelzaf.mvpexercise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements  MainContract.View, View.OnClickListener{

    private TextView textView;
    private MainPresenter mainPresenter;
    @Override
    public void onClick(View view) {
        mainPresenter.loadHelloText();
    }

    @Override
    public void onTextLoaded(String text) {
        textView.setText(text);
    }

    @Override
    protected int getContentResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        textView = findViewById(R.id.tvHello);
        textView.setOnClickListener(this);
        mainPresenter = new MainPresenter();
        mainPresenter.atach(this);
        mainPresenter.loadHelloText();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detach();
    }
}
