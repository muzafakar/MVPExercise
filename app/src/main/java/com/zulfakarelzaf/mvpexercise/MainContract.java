package com.zulfakarelzaf.mvpexercise;

/**
 * Created by Zulfakar on 3/31/2018.
 * For education and personal purposes
 */

public interface MainContract {
    // User actions. Presenter will implement
    interface Presenter extends BaseMVPPresenter<View>{
        void loadHelloText();
    }

    // Action callbacks. Activity/Fragment will implement
    interface View extends BaseView {
        void onTextLoaded(String text);
    }
}
