package com.example.ccacc.mybudget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button mainButton = (Button) findViewById(R.id.mainButton);
        mainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Intent sheetActivity = new Intent(this, BudgetSheetActivity.class);
        startActivity(sheetActivity);
    }
}
