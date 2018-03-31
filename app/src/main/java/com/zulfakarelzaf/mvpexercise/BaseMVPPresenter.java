package com.zulfakarelzaf.mvpexercise;

/**
 * Created by Zulfakar on 3/31/2018.
 * For education and personal purposes
 */

public interface BaseMVPPresenter<V extends BaseView> {
    void atach(V view);
    void detach();
    boolean isAttached();
}
