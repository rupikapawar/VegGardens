package com.example.rupik.veggarden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView mFarmer, mBuyer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFarmer = findViewById(R.id.mFarmer);

        mFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FarmerSignupActivity.class);
                startActivity(i);
            }
        });

        mBuyer = findViewById(R.id.mBuyer);

        mBuyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), BuyerSignupActivity.class);
                startActivity(i);
            }
        });

    }
}
