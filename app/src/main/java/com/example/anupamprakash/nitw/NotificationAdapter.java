package com.example.anupamprakash.nitw;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by ANUPAM PRAKASH on 23-10-2018.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private String[] dataset;
    private Context context;
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(TextView textView) {
            super(textView);
            this.textView=textView;
        }
    }

    public NotificationAdapter(Context context,String []dataset)
    {
        this.dataset=dataset;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final String data = dataset[position];
        holder.textView.setText(data);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,data,Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }
}
