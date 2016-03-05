package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.ui.base.MvpView;

/**
 * Created by kevinmenager on 05/03/16.
 */
public interface MainView extends MvpView {

    void displayJokes(String joke);
    void showError(String message);
}
