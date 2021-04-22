package com.example.tugasrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {
    private TextView tvVacayPlaces,tvVacayDesc;
    private ImageView ivVacayPhoto;

    String name, desc;
    int photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvVacayDesc = findViewById(R.id.tvDetailSum);
        tvVacayPlaces = findViewById(R.id.tvDetailName);
        ivVacayPhoto = findViewById(R.id.ivDetail);

        tvVacayPlaces.setText(getIntent().getStringExtra("judul"));
        tvVacayDesc.setText(getIntent().getStringExtra("deskripsi"));
        ivVacayPhoto.setImageResource(getIntent().getIntExtra("poto", 0));

        final Button button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}