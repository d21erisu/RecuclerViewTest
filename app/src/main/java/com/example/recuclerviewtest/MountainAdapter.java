package com.example.recuclerviewtest;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainViewHolder>{
    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {
        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
