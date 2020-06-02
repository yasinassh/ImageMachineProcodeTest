package com.example.imagemachine;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMachineActivity extends AppCompatActivity {
    private static final String TAG = "DetailMachineActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_machine_activity);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intent");

        if (getIntent().hasExtra("machine_title")) {
            Log.d(TAG, "getIncomingIntent: found intent extras");
            String machineTitle = getIntent().getStringExtra("machine_title");
            setData(machineTitle);
        }
    }

    private void setData(String machineTitle) {
        Log.d(TAG, "setData: setting title to the widgets");

        TextView title = findViewById(R.id.machineTitleField);
        title.setText(machineTitle);
    }
}
