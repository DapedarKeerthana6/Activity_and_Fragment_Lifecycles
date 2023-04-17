package com.example.activity_and_fragment_lifecycles;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment1", "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Fragment1", "onCreatedView");
        return inflater.inflate(R.layout.fragment_1, container, false);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Fragment1", "Attached");

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("Fragment1", "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragment1", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragment1", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment1", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragment1", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment1", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment1", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment1", "onDetach");
    }
}