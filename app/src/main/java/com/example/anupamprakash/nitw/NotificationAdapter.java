package com.example.anupamprakash.nitw;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ramotion.foldingcell.FoldingCell;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by ANUPAM PRAKASH on 23-10-2018.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    private String[] dataset;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        LinearLayout layout;
        private ItemClickListener clickListener;

        public ViewHolder(LinearLayout layout) {
            super(layout);
            this.layout=layout;
        }

        public void setClickListener(ItemClickListener itemClickListener)
        {
            this.clickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {

            clickListener.Onclick(view,getPosition());

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
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final String data = dataset[position];

        holder.setClickListener(new ItemClickListener() {

            @Override
            public void Onclick(View view, int position) {

                final FoldingCell fc = (FoldingCell)view.findViewById(R.id.folding_cell);

                Toast.makeText(context, "hello"+position, Toast.LENGTH_SHORT).show();

                // attach click listener to fold btn
                final Button toggleBtn = (Button) view.findViewById(R.id.toggle_btn);

                toggleBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc.toggle(false);
                    }

                });
            }

        });

    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }
}
