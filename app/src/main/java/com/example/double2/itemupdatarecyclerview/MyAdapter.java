package com.example.double2.itemupdatarecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    public String[] data;

    public MyAdapter(Context context, String[] data){
        this.context=context;
        this.data=data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvItem.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvItem;

        public ViewHolder(View itemView) {
            super(itemView);
            tvItem=(TextView)itemView.findViewById(R.id.tv_item) ;
        }
    }

}
