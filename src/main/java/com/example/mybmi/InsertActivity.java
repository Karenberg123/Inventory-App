package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initViews();
        setListensers();
    }
    private Button button_insert;
    private void initViews() {
        button_insert = (Button) findViewById(R.id.insertbutton);
    }
    private void setListensers()
    {
        button_insert.setOnClickListener(gotoInt);
    }
    private View.OnClickListener gotoInt = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(InsertActivity.this,InitialActivity.class);
            startActivity(intent);
        }
    };
}