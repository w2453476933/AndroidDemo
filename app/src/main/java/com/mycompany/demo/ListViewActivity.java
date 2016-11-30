package com.mycompany.demo;

import android.os.Bundle;
import android.app.*;
import android.widget.*;
import android.view.*;

public class ListViewActivity extends Activity {
    ListView listView1;
    ListView listView2;
    ListView listView3;
    ListView listView4;
    String[] arg=new String[]{"张三","李四","王五","赵二"};
    String[] arg2=new String[]{"英雄联盟","穿越火线","坦克世界"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewlayout);
        listView1=(ListView)findViewById(R.id.listView1);
        listView2=(ListView)findViewById(R.id.listView2);
        listView3=(ListView)findViewById(R.id.listView3);
        listView4=(ListView)findViewById(R.id.listView4);
        //普通ListView
        ArrayAdapter<?> arrayAdapter1= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arg);
        listView1.setAdapter(arrayAdapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,arg[position],Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter arrayAdapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arg2);
        listView2.setAdapter(arrayAdapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,arg2[position],Toast.LENGTH_SHORT).show();
            }
        });
        //单选框ListView
        ArrayAdapter arrayAdapter3=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,arg);
        listView3.setAdapter(arrayAdapter3);
        listView3.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //复选框ListView
        ArrayAdapter arrayAdapter4=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arg2);
        listView4.setAdapter(arrayAdapter4);
        listView4.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }
}
