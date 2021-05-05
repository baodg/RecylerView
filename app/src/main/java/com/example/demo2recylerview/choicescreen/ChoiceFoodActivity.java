package com.example.demo2recylerview.choicescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.demo2recylerview.R;

import java.util.ArrayList;

public class ChoiceFoodActivity extends AppCompatActivity {

    private RecyclerView rvDonut;
    private DonutAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private ArrayList<DonutModel> listDonut;
    private ArrayList<DonutModel> mightList = new ArrayList<>();
    private Button a, b, c;
    private EditText find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_food);
        mapping();
        initRecyclerView();
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDonut.clear();

                listDonut.add((new DonutModel(R.drawable.donut_yellow_1, "Tasty Donut", "Spicy tasty donut family", 10)));
                listDonut.add((new DonutModel(R.drawable.tasty_donut_1, "Pink Donut", "Spicy tasty donut family", 20)));
                listDonut.add((new DonutModel(R.drawable.green_donut_1, "Floating Donut", "Spicy tasty donut family", 20)));
                listDonut.add((new DonutModel(R.drawable.donut_red_1, "Tasty Donut", "Spicy tasty donut family", 30)));

                mAdapter.setListDto(listDonut);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDonut.clear();
                listDonut.add((new DonutModel(R.drawable.tasty_donut_1, "Pink Donut", "Spicy tasty donut family", 20)));
                mAdapter.setListDto(listDonut);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDonut.clear();
                listDonut.add((new DonutModel(R.drawable.green_donut_1, "Floating Donut", "Spicy tasty donut family", 20)));
                mAdapter.setListDto(listDonut);
            }
        });

        find.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                listDonut.clear();
                for (DonutModel i : mightList) {
                    if (i.getName().toLowerCase().contains(s.toString())) {
                        listDonut.add(i);
                    }
                }

                mAdapter.setListDto(listDonut);
            }
        });
    }

    private void mapping() {
        rvDonut = findViewById(R.id.rv_donut);
        a = findViewById(R.id.btn_a);
        b = findViewById(R.id.btn_b);
        c = findViewById(R.id.btn_c);
        find = findViewById(R.id.search);
    }

    private void initRecyclerView() {
        listDonut = new ArrayList<>();

        listDonut.add((new DonutModel(R.drawable.donut_yellow_1, "Tasty Donut", "Spicy tasty donut family", 10)));
        listDonut.add((new DonutModel(R.drawable.tasty_donut_1, "Pink Donut", "Spicy tasty donut family", 20)));
        listDonut.add((new DonutModel(R.drawable.green_donut_1, "Floating Donut", "Spicy tasty donut family", 20)));
        listDonut.add((new DonutModel(R.drawable.donut_red_1, "Tasty Donut", "Spicy tasty donut family", 30)));

        mightList.addAll(listDonut);
        mAdapter = new DonutAdapter(this, listDonut);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvDonut.setAdapter(mAdapter);
        rvDonut.setLayoutManager(mLayoutManager);
    }
}