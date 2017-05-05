package com.shakeup.codingchallenge.Guides;

import android.support.annotation.NonNull;

/**
 * Created by Jayson on 5/5/2017.
 */

public class GuidesPresenter implements GuidesContract.Presenter{

    // Reference to our view
    GuidesContract.View mGuidesView;

    /**
     * Presenter constructor receives the fragment to be attached
     * @param guidesView is the fragment we're going to control
     */
    public GuidesPresenter(
            @NonNull GuidesContract.View guidesView) {
        mGuidesView = guidesView;
    }

    @Override
    public void onViewCreated() {

    }
}
