package com.training.android.sharedprefdemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        // Save data to SharedPreferences
        SharedPreferences sharedPref = getSharedPreferences("TrainingData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("username", mEtUsername.getText().toString());
        editor.putString("password", mEtPassword.getText().toString());

        boolean isSuccessful = editor.commit();
        if (isSuccessful) {
            Toast.makeText(this, "Data was successfully saved", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Data was NOT saved", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToActivityB(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}
