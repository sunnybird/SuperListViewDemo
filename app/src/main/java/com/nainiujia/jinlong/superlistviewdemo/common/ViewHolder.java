package com.nainiujia.jinlong.superlistviewdemo.common;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by JinLong on 2015/6/21.
 */
public class ViewHolder {


    private SparseArray<View> mViews;

    private Context mContext;

    private Inflater mInflater;

    private int mPosition;

    private View mConvertView;

    private ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {


        mContext = context;
        mPosition = position;
        mViews = new SparseArray<View>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);

        mConvertView.setTag(this);


    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {


        if (convertView == null) {

            return new ViewHolder(context, parent, layoutId, position);
        } else {

            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.mPosition = position;

            return viewHolder;
        }
    }

    public View getConvertView() {

        return mConvertView;
    }


    /**
     * 通过viewId获取控件
     * @param viewId
     * @param <T>
     * @return
     */

    public <T extends View> T getVIew(int viewId) {

        View view = mViews.get(viewId);

        if (view == null) {

            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }

        return (T) view;

    }


}
