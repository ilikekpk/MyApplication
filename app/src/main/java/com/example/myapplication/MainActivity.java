package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private MyFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new MyFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new MyFragment(), "firstfrag");
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new MyFragment(), "firstfrag1").commit();
       //getSupportFragmentManager().beginTransaction().add(findViewById(R.id.), new )
    }
}