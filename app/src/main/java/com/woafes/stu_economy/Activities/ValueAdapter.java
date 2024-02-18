package com.woafes.stu_economy.Activities;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.woafes.stu_economy.Models.Values;
import com.woafes.stu_economy.R;

import java.util.List;

public class ValueAdapter extends RecyclerView.Adapter<ValueAdapter.ViewHolder>{

    interface OnValueClickListener {
        void onValueClick(Values values, int position);
    }

    private final OnValueClickListener onClickListener;

    private final LayoutInflater inflater;
    private List<Values> values;

    ValueAdapter(Context context, List<Values> values, OnValueClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    public void editValues(List<Values> values){
        this.values = values;
    }

    @Override
    public ValueAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ValueAdapter.ViewHolder holder, int position) {
        Values values = this.values.get(position);
        holder.imageView.setImageResource(values.getIconImage());
        holder.nameView.setText(values.getName());
        holder.valueView.setText(values.getValue());
        //holder.nameView.setTextColor();
        //holder.capitalView.setTextColor(R.color.text);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onValueClick(values, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, valueView;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.image);
            nameView = view.findViewById(R.id.name);
            valueView = view.findViewById(R.id.value);
        }
    }
}