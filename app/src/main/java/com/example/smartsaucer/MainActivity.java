package com.example.smartsaucer;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button cleanButton;
    private Button sauceButton;
    private Button settingsButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Makes the Clean Cycle Button work
        cleanButton = (Button) findViewById(R.id.cleanButton);
        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCleanCycleActivity();
            }
        });


        //Makes the Sauce Button work
        sauceButton = (Button) findViewById(R.id.sauceButton);
        sauceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaucingActivity();
            }
        });



        //Makes the Settings Button work
        settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });




    }

    public void openCleanCycleActivity() {
        Intent intent = new Intent(this, CleanCycleActivity.class);
        startActivity(intent);

    }


    public void openSaucingActivity() {
        Intent intent = new Intent(this, SaucingActivity.class);
        startActivity(intent);
    }


    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }


}
