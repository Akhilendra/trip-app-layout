package com.example.trips.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.trips.Adapters.RecentTripsAdapter;
import com.example.trips.R;

import java.util.ArrayList;
import java.util.List;

public class RecentTripsActivity extends AppCompatActivity {

    RecyclerView recentTrips;
    List<Integer> trips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_trips);

        recentTrips=findViewById(R.id.recentTripsRecycler);
        recentTrips.setHasFixedSize(true);
        recentTrips.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        trips=new ArrayList<>();
        trips.add(R.drawable.trip2);
        trips.add(R.drawable.trip3);
        trips.add(R.drawable.trip4);
        trips.add(R.drawable.trip5);

        RecentTripsAdapter adapter=new RecentTripsAdapter(this, trips);
        recentTrips.setAdapter(adapter);
    }
}
