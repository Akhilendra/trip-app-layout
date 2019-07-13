package com.example.trips.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trips.Adapters.CallAdapter;
import com.example.trips.R;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {

    List<String> items;
    CallAdapter callAdapter;
    RecyclerView recyclerView;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calls, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        context=getContext();

        items = new ArrayList<>();
        items.add("User 1");
        items.add("User 2");
        items.add("User 3");
        items.add("User 4");
        items.add("User 5");
        items.add("User 6");
        items.add("User 7");
        items.add("User 8");
        items.add("User 9");
        items.add("User 10");

        callAdapter=new CallAdapter(context,items);
        recyclerView.setAdapter(callAdapter);

        return view;
    }

}



