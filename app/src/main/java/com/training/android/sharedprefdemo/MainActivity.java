package com.training.android.sharedprefdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtUsername;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtUsername = (EditText) findViewById(R.id.etUsername);
        mEtPassword = (EditText) findViewById(R.id.etPassword);
    }

    public void save(View view) {
        // TODO: Save data to SharedPreferences
    }

    public void goToActivityB(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}
