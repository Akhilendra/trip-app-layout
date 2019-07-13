package com.example.trips.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trips.R;

import java.util.List;

public class RecentTripsAdapter extends RecyclerView.Adapter<RecentTripsAdapter.RecentTripsViewHolder> {

    private Context context;
    private List<Integer> trips;

    public RecentTripsAdapter(Context context, List<Integer> trips) {
        this.context = context;
        this.trips = trips;
    }

    @NonNull
    @Override
    public RecentTripsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item_fragment_trip_userdetails,null);
        return new RecentTripsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentTripsViewHolder recentTripsViewHolder, int i) {
        recentTripsViewHolder.imageView.setImageResource(trips.get(i));
    }

    @Override
    public int getItemCount() {
        return trips.size();
    }

    class RecentTripsViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public RecentTripsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.tvTrip);
            imageView=itemView.findViewById(R.id.ivTrip);
        }
    }
}
