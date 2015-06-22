package com.nainiujia.jinlong.superlistviewdemo;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nainiujia.jinlong.superlistviewdemo.adapter.MyAdapter;
import com.nainiujia.jinlong.superlistviewdemo.beans.Person;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.NoTitle;

import java.util.ArrayList;
import java.util.List;


@NoTitle
@Fullscreen //全屏
@EActivity(R.layout.activity_main)
public class MainActivity extends ListActivity {


    private List<Person> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        mDatas = new ArrayList<Person>();
        loadDatas();

        this.setListAdapter(new MyAdapter(this,mDatas,R.layout.item_listview));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private  void loadDatas(){


        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));

        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
        mDatas.add(new Person("lao wang","address 1","111111"));
    }
}
