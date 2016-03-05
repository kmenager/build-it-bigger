package com.udacity.gradle.builditbigger.ui.base;

/**
 * Created by kevinmenager on 05/03/16.
 */
public interface Presenter<T extends MvpView> {
    void attachView(T mvpView);
    void detachView();
}
