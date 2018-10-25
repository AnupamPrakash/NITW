package com.example.anupamprakash.nitw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

public class Notification extends Activity {

    private RecyclerView recyclerView;
    private  RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager rLayoutManager;
    private String[] dataset;


    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView=(RecyclerView) findViewById(R.id.notification_list);
        recyclerView.setHasFixedSize(true);
//
        rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);

        dataset=new String[26];
        int k=97;
        for(int i=0;i<26;i++)
        {
            dataset[i]= String.valueOf(((char)(k+i)));
//            Toast.makeText(this, dataset[i],Toast.LENGTH_SHORT).show();
        }

        rAdapter=new NotificationAdapter(this,dataset);
        recyclerView.setAdapter(rAdapter);
    }

}
