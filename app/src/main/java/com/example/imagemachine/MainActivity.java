package com.example.imagemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<String> machineTitle = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMachineData();
    }

    private void initMachineData() {
        Log.d(TAG, "initMachineData: prepare");

        machineTitle.add("Foto-foto alaykuh");
        machineTitle.add("Otomotif");
        machineTitle.add("Makanan");
        machineTitle.add("Kendaraan");
        machineTitle.add("Motor-motoran");
        machineTitle.add("Ikaaaaaan");
        machineTitle.add("Kebun Binatang");
        machineTitle.add("Manteman");
        machineTitle.add("Hehe");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        // Initiate recycler view
        recyclerView = (RecyclerView) findViewById(R.id.rvMachine);
        // Use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // specify an adapter

        mAdapter = new MachineAdapter(this, machineTitle);
        recyclerView.setAdapter(mAdapter);

        Toolbar mToolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.top_app_bar, menu);
        return true;
    }
}
