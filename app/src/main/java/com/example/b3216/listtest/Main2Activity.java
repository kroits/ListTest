package com.example.b3216.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = (ListView) findViewById(R.id.ListView);
        //GridView gridView= (GridView) findViewById(R.id.gridView);

        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,DAYS);
        listView.setAdapter(adapter);

        ListAdapter adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,WEEK);
        // gridView.setAdapter(adapter1);
    }
    /*  리스트 수정 부분
     */
    private static final String[] DAYS = new String[] {"일요일", "월요일"," 화요일","수요일","목요일","금요일","토요일","1","2","3","4"};

    private static final String[] WEEK = new String[] {"월","화","수","목","금","토"};
    }

