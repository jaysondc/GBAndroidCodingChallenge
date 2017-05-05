package com.shakeup.codingchallenge.Guides;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.shakeup.codingchallenge.Model.RequestQueueSingleton;

/**
 * Created by Jayson on 5/5/2017.
 */

public class GuidesPresenter implements GuidesContract.Presenter {

    // Reference to our view
    GuidesContract.View mGuidesView;

    public final String LOG_TAG = GuidesPresenter.class.getSimpleName();

    /**
     * Presenter constructor receives the fragment to be attached
     *
     * @param guidesView is the fragment we're going to control
     */
    public GuidesPresenter(
            @NonNull GuidesContract.View guidesView) {
        mGuidesView = guidesView;
    }

    @Override
    public void onViewCreated() {

        requestData();

    }

    public void requestData() {
        Context context = mGuidesView.getFragmentContext();

        // Get a RequestQueue
        RequestQueue queue = RequestQueueSingleton.getInstance(context).
                getRequestQueue();


        // Create a request for guides
        String url ="https://guidebook.com/service/v2/upcomingGuides";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        // Print the response
                        Log.d(LOG_TAG, "Response Received! Message: " + response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(LOG_TAG, "There was a network error.");
            }
        });

        // Add a request (in this example, called stringRequest) to your RequestQueue.
        RequestQueueSingleton.getInstance(context).addToRequestQueue(stringRequest);
    }
}
