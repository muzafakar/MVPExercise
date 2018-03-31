package com.zulfakarelzaf.mvpexercise;

import java.util.Random;

/**
 * Created by Zulfakar on 3/31/2018.
 * For education and personal purposes
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private String[] helloTexts = {"BONJOUR", "HOLA", "HALLO", "MERHABA", "HELLO", "CIAO", "KONNICHIWA"};

    @Override
    public void loadHelloText() {
        Random random = new Random();
        String hello = helloTexts[random.nextInt(helloTexts.length)];
        getView().onTextLoaded(hello);
    }
}