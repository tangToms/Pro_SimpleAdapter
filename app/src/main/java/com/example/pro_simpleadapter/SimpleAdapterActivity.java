package com.example.pro_simpleadapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import androidx.annotation.Nullable;

public class SimpleAdapterActivity extends Activity {
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_simpleadapter);
        //初始化上下文
        mContext=SimpleAdapterActivity.this;
        //获取ListView
        ListView listView=findViewById(R.id.lv1);
        //创建数据
        ArrayList<HashMap<String,?>> arrayList = new ArrayList<>();
        for (int i=0;i<6;i++){
            HashMap<String,Object> hashMap = new HashMap<>();
            hashMap.put("pic",R.mipmap.ic_launcher);
            hashMap.put("text","simpleAdapter"+i);
            arrayList.add(hashMap);
        }
        //创建SimplaAdapter
        //参数1：上下文；参数2：数据；参数3：子ItemView布局；参数4：查找HashMap中值；
        //参数5：和HashMap值对应的ItemView中视图组件id数组
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                mContext,
                arrayList,
                R.layout.t_simpleadpater_item,
                new String[]{"pic","text"},
                new int[]{R.id.iv1,R.id.tv1});
        //设置adapter
        listView.setAdapter(simpleAdapter);
    }
}
