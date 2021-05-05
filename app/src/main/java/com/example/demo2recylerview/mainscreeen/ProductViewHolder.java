package com.example.demo2recylerview.mainscreeen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo2recylerview.R;
import com.example.demo2recylerview.contant.Contants;
import com.example.demo2recylerview.detailscreen.DetailActivity;
import com.example.demo2recylerview.model.ProductModel;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private Context mContext;
    private View mItemView;
    private ImageView imgPlus, imgAvatar;
    private TextView txtPrice, txtName;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;
        mContext = itemView.getContext();
        mapping(mItemView);
    }

    private void mapping(View itemView) {
        imgAvatar = itemView.findViewById(R.id.imgItem);
        imgPlus = itemView.findViewById(R.id.imgPlus);
        txtName = itemView.findViewById(R.id.txtName);
        txtPrice = itemView.findViewById(R.id.txtPrice);

    }

    public void bindView(ProductModel data) {
        //bind View function
        imgAvatar.setImageResource(data.getAvatar());
        txtName.setText(data.getName());
        txtPrice.setText(String.format("%s$", data.getPrice()));

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                Bundle bundel = new Bundle();
                bundel.putInt(Contants.ARG_PRICE, data.getPrice());
                bundel.putInt(Contants.ARG_IMAGE, data.getAvatar());
                bundel.putString(Contants.ARG_NAME, data.getName());
                bundel.putString(Contants.ARG_DESC, data.getDesc());
                intent.putExtras(bundel);
                mContext.startActivity(intent);
            }
        });
    }
}
