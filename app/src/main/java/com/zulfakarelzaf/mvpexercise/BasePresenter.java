package com.zulfakarelzaf.mvpexercise;

/**
 * Created by Zulfakar on 3/31/2018.
 * For education and personal purposes
 */

public class BasePresenter<V extends BaseView> implements BaseMVPPresenter<V> {
    private V view;
    @Override
    public void atach(V view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    @Override
    public boolean isAttached() {
        return view != null;
    }

    public V getView(){
        return view;
    }
}
