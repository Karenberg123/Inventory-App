package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        initViews();
        setListensers();
    }
    private Button button_delete;
    private void initViews() {
        button_delete = (Button) findViewById(R.id.deletebutton);
    }
    private void setListensers()
    {
        button_delete.setOnClickListener(gotoInt);
    }
    private View.OnClickListener gotoInt = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(DeleteActivity.this,InitialActivity.class);
            startActivity(intent);
        }
    };
}