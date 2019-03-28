package com.demo.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crlgc.mysharedpreferences.MySharedPreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySharedPreferences sharedPreferences = new MySharedPreferences(this, "database");
        sharedPreferences.putValue("name", "wsl");

    }
}
