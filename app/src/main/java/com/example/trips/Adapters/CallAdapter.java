package com.example.trips.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.trips.R;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallViewHolder> {


    private Context context;
    private List<String> callList;

    public CallAdapter(Context context, List<String> callList) {
        this.context = context;
        this.callList = callList;
    }

    @NonNull
    @Override
    public CallViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_fragment_call,null);
        return new CallViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallViewHolder callViewHolder, int i) {
        callViewHolder.textView.setText(callList.get(i));
    }

    @Override
    public int getItemCount() {
        return callList.size();
    }

    class CallViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public CallViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.tvName);
        }
    }
}
