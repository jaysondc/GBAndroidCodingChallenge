package com.shakeup.codingchallenge.Guides;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.shakeup.codingchallenge.R;

import java.util.ArrayList;

/**
 * Created by Jayson on 5/5/2017.
 */

public class GuidesRecyclerAdapter
        extends RecyclerView.Adapter<GuidesRecyclerAdapter.GuidesViewHolder> {

    // Array of Guides
    ArrayList<GuidesPresenter.Guide> mGuides;
    private Context mContext;

    // Constructor
    public GuidesRecyclerAdapter(Context context, ArrayList<GuidesPresenter.Guide> guides){
        mContext = context;
        mGuides = guides;
    }

    @Override
    public GuidesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflate a View for a single Guide
        final View guideView = inflater.inflate(
                R.layout.listitem_guide,
                parent,
                false);

        // Create and return our ViewHolder
        return new GuidesViewHolder(guideView);
    }

    @Override
    public void onBindViewHolder(GuidesViewHolder holder, int position) {
        GuidesPresenter.Guide guide = mGuides.get(position);

        holder.name.setText(guide.guideName);
        holder.city.setText(guide.venueCity);
        holder.state.setText(guide.venueState);
        holder.startDate.setText(guide.startDate);
        holder.endDate.setText(guide.endDate);

        Glide
                .with(mContext)
                .load(guide.iconUrl)
                .into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return mGuides.size();
    }

    /**
     * ViewHolder used to interact with Guide view objects
     */
    class GuidesViewHolder extends RecyclerView.ViewHolder{
        public TextView name, city, state, startDate, endDate;
        public ImageView icon;

        public GuidesViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.guide_name);
            city = (TextView) itemView.findViewById(R.id.guide_city);
            state = (TextView) itemView.findViewById(R.id.guide_state);
            startDate = (TextView) itemView.findViewById(R.id.guide_start_date);
            endDate = (TextView) itemView.findViewById(R.id.guide_end_date);
            icon = (ImageView) itemView.findViewById(R.id.guide_image);
        }


    }
}
