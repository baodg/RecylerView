package com.example.demo2recylerview.choicescreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo2recylerview.R;
import com.example.demo2recylerview.donutdetail.DonutDetailActivity;

import java.util.ArrayList;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.DonutViewHolder> {

    private Context mContext;
    private ArrayList<DonutModel> listDto;

    public DonutAdapter(Context context, ArrayList<DonutModel> listDto) {
        this.mContext = context;
        this.listDto = listDto;
    }

    public void setListDto(ArrayList<DonutModel> listDto) {
        this.listDto = listDto;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DonutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_view, parent, false);
        return new DonutViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DonutViewHolder holder, int position) {
        DonutModel data = listDto.get(position);
        holder.bindView(data);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DonutDetailActivity.class);
                intent.putExtra("avatar" , data.getAvatar());
                intent.putExtra("price" , data.getPrice());
                intent.putExtra("desc" , data.getDesc());
                intent.putExtra("name" , data.getName());
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listDto.size();
    }

    class DonutViewHolder extends RecyclerView.ViewHolder {
        View mItemView;
        ImageView avatar;
        TextView txtName, txtDesc, txtPrice;

        public DonutViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemView = itemView;
            mapping(mItemView);
        }

        public void bindView(DonutModel data) {
            avatar.setImageResource(data.getAvatar());
            txtName.setText(data.getName());
            txtDesc.setText(data.getDesc());
            txtPrice.setText(data.getPrice() + "$");
        }

        private void mapping(View view) {
            avatar = view.findViewById(R.id.avatar);
            txtName = view.findViewById(R.id.name);
            txtDesc = view.findViewById(R.id.desc);
            txtPrice = view.findViewById(R.id.price);
        }
    }
}
