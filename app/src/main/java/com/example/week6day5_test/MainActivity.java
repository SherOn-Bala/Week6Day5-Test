package com.example.week6day5_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

import static com.example.week6day5_test.Algorithms.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG_Q1", String.valueOf(binarySearch(new int[] {1,2,3,4,5,6,10,20,50}, 20)));
        Log.d("TAG_Q2", String.valueOf(powerOf(2, 10)));
        Log.d("TAG_Q3", Arrays.toString(removeDuplicates(new int[] {0, 0, -1, 9,2,2,20,5,6,2,20,9})));

    }
}
