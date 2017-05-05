package com.shakeup.codingchallenge.Guides;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Jayson on 5/5/2017.
 */

public interface GuidesContract {

    interface View{
        void loadRecyclerView(ArrayList<GuidesPresenter.Guide> guides);

        Context getFragmentContext();
    }

    interface Presenter{
        void onViewCreated();
    }
}
