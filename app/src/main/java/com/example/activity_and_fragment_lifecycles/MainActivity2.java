package com.example.activity_and_fragment_lifecycles;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
 Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MainAct2", "onCreate");
        setContentView(R.layout.activity_main2);
        Button btn2 = findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               LoadFragment(new Fragment1());
            }
        });
    }
    public void LoadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment);
        ft.commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainAct2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainAct2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainAct2", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainAct2", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainAct2", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainAct2", "onRestart");

    }
}