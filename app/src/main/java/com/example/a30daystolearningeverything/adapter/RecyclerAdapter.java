package com.example.a30daystolearningeverything.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a30daystolearningeverything.R;
import com.example.a30daystolearningeverything.model.RecyclerModel;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private List<RecyclerModel> recyclerModels;

    public RecyclerAdapter(Context context, List<RecyclerModel> recyclerModels) {
        this.context = context;
        this.recyclerModels = recyclerModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerModel model = recyclerModels.get(position);
        holder.txtDays.setText(model.getDays());
        holder.txtTitle.setText(model.getTitle());
        holder.image.setImageResource(model.getImage());
        holder.txtDescription.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return recyclerModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtDays, txtTitle, txtDescription;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDays = itemView.findViewById(R.id.txt_days);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescription = itemView.findViewById(R.id.txt_details);
            image = itemView.findViewById(R.id.image);
        }
    }
}
