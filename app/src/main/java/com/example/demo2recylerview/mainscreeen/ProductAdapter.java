package com.example.demo2recylerview.mainscreeen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo2recylerview.R;
import com.example.demo2recylerview.model.ProductModel;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter {

    private ArrayList<ProductModel> listData;
    private Context mContext;

    public ProductAdapter(ArrayList<ProductModel> listData, Context mContext) {
        this.listData = listData;
        this.mContext = mContext;
    }

    public ArrayList<ProductModel> getListData() {
        return listData;
    }

    public void setListData(ArrayList<ProductModel> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcl_item, parent, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductViewHolder mHolder = (ProductViewHolder) holder;
        mHolder.bindView(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
