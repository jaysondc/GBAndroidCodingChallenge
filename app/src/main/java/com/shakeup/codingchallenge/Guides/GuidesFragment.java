package com.shakeup.codingchallenge.Guides;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shakeup.codingchallenge.R;

import org.json.JSONArray;

/**
 * Created by Jayson on 5/5/2017.
 */

public class GuidesFragment extends Fragment implements GuidesContract.View {

    // Reference to our presenter
    GuidesContract.Presenter mGuidesPresenter;


    public static GuidesFragment newInstance(){
        return new GuidesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root;

        root = inflater.inflate(R.layout.fragment_guides, container, false);

        mGuidesPresenter = new GuidesPresenter(this);

        // Let our view know the fragment is loaded
        mGuidesPresenter.onViewCreated();

        return root;
    }

    @Override
    public void loadRecyclerView(JSONArray guides) {

    }

    @Override
    public Context getFragmentContext(){
        return getContext();
    }
}
