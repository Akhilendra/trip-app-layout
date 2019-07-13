package com.example.trips.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.trips.Activities.RecentTripsActivity;
import com.example.trips.R;

public class UserDetailsFragment extends Fragment {

    RelativeLayout ongoingTrip;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_userdetails,container,false);

        context=getContext();
        ongoingTrip=view.findViewById(R.id.rel1);
        ongoingTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, RecentTripsActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
