package com.shakeup.codingchallenge.Guides;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shakeup.codingchallenge.R;

import java.util.ArrayList;

/**
 * Created by Jayson on 5/5/2017.
 */

public class GuidesFragment extends Fragment implements GuidesContract.View {

    // Reference to our presenter
    GuidesContract.Presenter mGuidesPresenter;

    RecyclerView mRecyclerView;


    public static GuidesFragment newInstance(){
        return new GuidesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root;

        root = inflater.inflate(R.layout.fragment_guides, container, false);
        mGuidesPresenter = new GuidesPresenter(this);

        // Get a reference to our recycler view
        mRecyclerView = (RecyclerView) root.findViewById(R.id.guide_recycler);

        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Let our view know the fragment is loaded
        mGuidesPresenter.onViewCreated();
    }

    @Override
    public void loadRecyclerView(ArrayList<GuidesPresenter.Guide> guides) {
        // Create our adapter
        GuidesRecyclerAdapter adapter = new GuidesRecyclerAdapter(
                getContext(),
                guides
        );
        // Create our LayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        // Assign them to the RecyclerView
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public Context getFragmentContext(){
        return getContext();
    }
}
