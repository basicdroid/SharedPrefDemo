package com.training.android.sharedprefdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView mTvUsername;
    private TextView mTvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        mTvUsername = (TextView) findViewById(R.id.tvUsername);
        mTvPassword = (TextView) findViewById(R.id.tvPassword);
    }

    public void loadData(View view) {
        // TODO: Implement retrieval of data from SharedPreferences
    }

    public void goBackToMainActivity(View view) {
        this.finish();
    }
}
