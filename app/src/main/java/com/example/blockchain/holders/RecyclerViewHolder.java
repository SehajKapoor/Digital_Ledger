package com.example.blockchain.holders;

import android.view.View;
import android.widget.TextView;

import com.example.blockchain.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView txtIndex, txtPreviousHash, txtTimestamp, txtData, txtHash;

    public RecyclerViewHolder(@NonNull final View itemView) {
        super(itemView);

        txtIndex = itemView.findViewById(R.id.txt_index);
        txtPreviousHash = itemView.findViewById(R.id.txt_previous_hash);
        txtTimestamp = itemView.findViewById(R.id.txt_timestamp);
        txtData = itemView.findViewById(R.id.txt_data);
        txtHash = itemView.findViewById(R.id.txt_hash);
    }
}
