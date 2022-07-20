package com.example.democirclemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleMenuLayout mCircleMenuLayout;

    private String[] mItemTexts = new String[] {"1号", "2号", "3号", "4号", "5号", "6号"};

    private int[] mItemImgs = new int[] {R.drawable.home_mbank_1_clicked,
            R.drawable.home_mbank_2_clicked, R.drawable.home_mbank_3_clicked,
            R.drawable.home_mbank_4_clicked, R.drawable.home_mbank_5_clicked,
            R.drawable.home_mbank_6_clicked};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}