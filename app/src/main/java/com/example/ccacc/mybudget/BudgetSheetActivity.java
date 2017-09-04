package com.example.ccacc.mybudget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BudgetSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_sheet);

        String[] categories = {"Rent", "Utilities", "Food"};
        String[] budget = {"941", "111", "450"};

        ListAdapter catAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categories);
        ListView catList = (ListView) findViewById(R.id.categories);
        catList.setAdapter(catAdapter);

        //ListAdapter budgetAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, budget);
        //ListView budgetList = (ListView) findViewById(R.id.budget);
        //budgetList.setAdapter(budgetAdapter);
    }
}
