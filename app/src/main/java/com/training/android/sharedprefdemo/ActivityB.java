package com.training.android.sharedprefdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    private static final String DEFAULT = "n/a";

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
        // Implement retrieval of data from SharedPreferences
        SharedPreferences sharedPref = getSharedPreferences("TrainingData", Context.MODE_PRIVATE);
        String username = sharedPref.getString("username", DEFAULT);
        String password = sharedPref.getString("password", DEFAULT);

        if (username.equals(DEFAULT) || password.equals(DEFAULT)) {
            Toast.makeText(this, "Data not found", Toast.LENGTH_SHORT).show();
        } else {
            mTvUsername.setText(username);
            mTvPassword.setText(password);
        }
    }

    public void goBackToMainActivity(View view) {
        this.finish();
    }
}
