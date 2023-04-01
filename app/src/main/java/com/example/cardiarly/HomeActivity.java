package com.example.cardiarly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_form);

        linearLayout = (LinearLayout) findViewById(R.id.carInfoLnearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarInfoActivity();
            }
        });

        button = (Button) findViewById(R.id.GorivaBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRefuelingActivity();
            }
        });

    }

    public void  openCarInfoActivity() {
        Intent intent = new Intent(this, CarInfoActivity.class);
        startActivity(intent);

    }
    public void    openRefuelingActivity() {
        Intent intent = new Intent(this, RefuelingActivity.class);
        startActivity(intent);

    }
}