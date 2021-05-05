package com.example.demo2recylerview.donutdetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo2recylerview.R;

public class DonutDetailActivity extends AppCompatActivity {

    private ImageView avatar;
    private TextView name, desc, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_detail);
        mapping();
        if (getIntent() != null) {
            int iavatar = getIntent().getIntExtra("avatar", 0);
            String iname = getIntent().getStringExtra("name");
            String idesc = getIntent().getStringExtra("desc");
            int iprice = getIntent().getIntExtra("price", 0);

            avatar.setImageResource(iavatar);
            name.setText(iname);
            desc.setText(idesc);
            price.setText(iprice + "$");

        }
    }

    private void mapping() {
        avatar = findViewById(R.id.avatar);
        name = findViewById(R.id.name);
        desc = findViewById(R.id.desc);
        price = findViewById(R.id.price);
    }
}