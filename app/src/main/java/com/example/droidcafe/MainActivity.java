package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void donut(View imageView2) {

        Toast.makeText(this, "You ordered an Donut", Toast.LENGTH_LONG).show();
    }

    public void iceCream(View imageView3) {

        Toast.makeText(this, "You ordered an Ice Cream sandwich", Toast.LENGTH_LONG).show();
    }

    public void yogurt(View imageView4) {

        Toast.makeText(this, "You ordered an Yogurt", Toast.LENGTH_LONG).show();
    }

}