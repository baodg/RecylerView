package com.example.demo2recylerview.mainscreeen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demo2recylerview.R;
import com.example.demo2recylerview.model.ProductModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProduct;
    private ArrayList<ProductModel> listProduct;
    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProduct = findViewById(R.id.rclName);
        listProduct = new ArrayList();
        listProduct.add(new ProductModel(R.drawable.images_2, 550, "Matteo Armchair"));
        listProduct.add(new ProductModel(R.drawable.images__2__1, 350, "Morden Armchair"));
        listProduct.add(new ProductModel(R.drawable.images__4__1, 250, "Nice Armchair"));
        listProduct.add(new ProductModel(R.drawable.images__5__1, 350, "Nice Armchair"));

        mAdapter = new ProductAdapter(listProduct, this);
        rvProduct.setAdapter(mAdapter);
        //rvProduct.setLayoutManager(new GridLayoutManager(this, 2));
       // rvProduct.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,true));
        rvProduct.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
    }
}