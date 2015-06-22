package com.nainiujia.jinlong.superlistviewdemo.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by JinLong on 2015/6/22.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected List<T> mDatas;

    protected LayoutInflater mInflater;

    private int layoutid;


    public CommonAdapter(Context mContext, List<T> mDatas,int layoutid) {

        this.mContext = mContext;
        this.mDatas = mDatas;
        this.mInflater = LayoutInflater.from(mContext);
        this.layoutid = layoutid;

    }


    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){


        ViewHolder holder = ViewHolder.get(mContext,convertView,parent,layoutid,position);

        convert(holder,getItem(position));

        return  holder.getConvertView();


    }

    public abstract void convert(ViewHolder holder,T t);




}
