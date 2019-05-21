package com.example.smartsaucer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button bluetoothButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        //Makes the Bluetooth Connect Button work
        bluetoothButton = findViewById(R.id.bluetoothButton);
        bluetoothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBluetoothActivity();
            }
        });



    }



    public void openBluetoothActivity() {
        Intent intent = new Intent(this, BluetoothActivity.class);
        startActivity(intent);

    }



}
