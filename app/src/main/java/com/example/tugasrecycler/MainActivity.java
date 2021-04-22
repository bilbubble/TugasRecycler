package com.example.tugasrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewVacay;

    private List<VacationModel> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewVacay = findViewById(R.id.rv);
        recyclerViewVacay.setHasFixedSize(true);
        models.addAll(VacationDatabase.getListData());
        recyclerViewVacay.setLayoutManager(new LinearLayoutManager(this));
        VacationAdapter adapter = new VacationAdapter(models);
        recyclerViewVacay.setAdapter(adapter);

    }


}