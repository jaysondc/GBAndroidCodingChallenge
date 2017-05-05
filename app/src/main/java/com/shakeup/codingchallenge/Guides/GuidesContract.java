package com.shakeup.codingchallenge.Guides;

import android.content.Context;

import org.json.JSONArray;

/**
 * Created by Jayson on 5/5/2017.
 */

public interface GuidesContract {

    interface View{
        void loadRecyclerView(JSONArray guides);

        Context getFragmentContext();
    }

    interface Presenter{
        void onViewCreated();
    }
}
