package com.bpi_111.stu_economy;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

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
        holder.flagView.setImageResource(values.getIconImage());
        holder.nameView.setText(values.getName());
        holder.capitalView.setText(values.getValue());
        holder.nameView.setTextColor(R.color.text);
        holder.capitalView.setTextColor(R.color.text);

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
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }
}