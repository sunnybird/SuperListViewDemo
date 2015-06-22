package com.nainiujia.jinlong.superlistviewdemo.adapter;

import android.content.Context;
import android.widget.TextView;

import com.nainiujia.jinlong.superlistviewdemo.R;
import com.nainiujia.jinlong.superlistviewdemo.beans.Person;
import com.nainiujia.jinlong.superlistviewdemo.common.CommonAdapter;
import com.nainiujia.jinlong.superlistviewdemo.common.ViewHolder;

import java.util.List;

/**
 * Created by JinLong on 2015/6/22.
 */
public class MyAdapter extends CommonAdapter<Person> {



    public MyAdapter(Context context,List<Person> datas,int layoutid){


        super(context,datas,layoutid);

    }
    @Override
    public void convert(ViewHolder holder, Person person) {

        ((TextView)holder.getVIew(R.id.item_name)).setText(person.getName());

        ((TextView)holder.getVIew(R.id.item_address)).setText(person.getAddress());
        ((TextView)holder.getVIew(R.id.item_phone)).setText(person.getPhone());
    }
}
