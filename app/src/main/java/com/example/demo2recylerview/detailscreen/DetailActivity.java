package com.example.demo2recylerview.detailscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo2recylerview.R;
import com.example.demo2recylerview.contant.Contants;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgAvatar;
    private TextView txtName, txtPrice, txtDescription, txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mapping();

        if (getIntent() != null) {
            Bundle args = getIntent().getExtras();
            int price = args.getInt(Contants.ARG_PRICE, 0);
            int image = args.getInt(Contants.ARG_IMAGE, 0);
            String name = args.getString(Contants.ARG_NAME, "");
            String desc = args.getString(Contants.ARG_DESC, "");

            imgAvatar.setImageResource(image);
            txtPrice.setText(String.format("$%s", price));
            txtName.setText(name);
            txtDescription.setText(desc);
        }


    }

    private void mapping() {
        imgAvatar = findViewById(R.id.imageView);
        txtName = findViewById(R.id.textView);
        txtPrice = findViewById(R.id.textView2);
        txtDescription = findViewById(R.id.textView4);

    }


}