package com.example.yash.testpro;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomList extends BaseAdapter {
    public Activity context;
    ArrayList<ModelProducts> modelProductses;

    public CustomList(Activity context,ArrayList<ModelProducts> modelProductses) {
        this.context=context;
        this.modelProductses=modelProductses;
    }

    @Override
    public int getCount() {
        return modelProductses.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.list_item_home, parent, false);

            holder= new ViewHolder();
            holder.itemImg=(ImageView) convertView.findViewById(R.id.item_img);
            holder.timeTxt=(TextView)convertView.findViewById(R.id.time_txt);
            holder.titleDescTv=(TextView)convertView.findViewById(R.id.title_desc_tv);
            holder.itemTitleTv = (TextView) convertView.findViewById(R.id.item_title_tv);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        ModelProducts homeModel = modelProductses.get(position);
        holder.timeTxt.setText(homeModel.getTimeTxt());
        holder.titleDescTv.setText(homeModel.getTitleDescTv());
        holder.itemImg.setImageResource(homeModel.getItemImg());
        holder.itemTitleTv.setText(homeModel.getItemTitleTv());

        return convertView;
    }

    public static class ViewHolder {
        TextView titleDescTv;
        TextView timeTxt;
        ImageView itemImg;
        TextView itemTitleTv;
    }
}
