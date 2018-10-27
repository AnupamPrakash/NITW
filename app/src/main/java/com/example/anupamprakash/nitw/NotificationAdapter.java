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

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout layout;
        private ItemClickListener clickListener;
        TextView titleTextView,contentTextView;
        public ViewHolder(View view) {
            super(view);
            titleTextView=(TextView) view.findViewById(R.id.titleView);
            contentTextView=(TextView)view.findViewById(R.id.contentView);
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
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_layout,parent,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final String data = dataset[position];
        holder.titleTextView.setText(data);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FoldingCell fc = (FoldingCell) v.findViewById(R.id.folding_cell);

                Toast.makeText(context, "hello" + data, Toast.LENGTH_SHORT).show();
                fc.toggle(false);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }
}
