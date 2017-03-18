package com.example.b3216.listtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout image1;
    private LinearLayout list1;
    private LinearLayout video1;
    private LinearLayout setting1;

    @Override

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.ListView);
        //GridView gridView= (GridView) findViewById(R.id.gridView);

        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,DAYS);
        listView.setAdapter(adapter);

        ListAdapter adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,WEEK);
        // gridView.setAdapter(adapter1);

        Button image = (Button)findViewById(R.id.listbutton);
        Button list = (Button)findViewById(R.id.imagebutton);
        Button video = (Button)findViewById(R.id.videobutton);
        Button setting = (Button)findViewById(R.id.settingbutton);

        image1 = (LinearLayout)findViewById(R.id.frame_layout_image);
        list1 = (LinearLayout)findViewById(R.id.frame_layout_list);
        video1 = (LinearLayout)findViewById(R.id.frame_layout_video);
        setting1 = (LinearLayout)findViewById(R.id.frame_layout_setting);

        image.setOnClickListener(this);
        list.setOnClickListener(this);
        video.setOnClickListener(this);
        setting.setOnClickListener(this);

    }
    /*  리스트 수정 부분
     */
    private static final String[] DAYS = new String[] {"일요일", "월요일"," 화요일","수요일","목요일","금요일","토요일","1","2","3","4"};

    private static final String[] WEEK = new String[] {"월","화","수","목","금","토"};


    @Override
    protected void onResume()
    {
        super.onResume();

        image1.setVisibility(LinearLayout.INVISIBLE);
        list1.setVisibility(LinearLayout.VISIBLE);
        video1.setVisibility(LinearLayout.INVISIBLE);
        setting1.setVisibility(LinearLayout.INVISIBLE);
    }
    @Override

    public void onClick(View v)
    {
        switch(v.getId())
        {
            // 빨간색버튼 클릭
            case R.id.imagebutton:
                image1.setVisibility(LinearLayout.VISIBLE);
                list1.setVisibility(LinearLayout.INVISIBLE);
                video1.setVisibility(LinearLayout.INVISIBLE);
                setting1.setVisibility(LinearLayout.INVISIBLE);
                break;

            // 파란색버튼 클릭
            case R.id.listbutton:
                image1.setVisibility(LinearLayout.INVISIBLE);
                list1.setVisibility(LinearLayout.VISIBLE);
                video1.setVisibility(LinearLayout.INVISIBLE);
                setting1.setVisibility(LinearLayout.INVISIBLE);
                break;
            case R.id.videobutton:
                image1.setVisibility(LinearLayout.INVISIBLE);
                list1.setVisibility(LinearLayout.INVISIBLE);
                video1.setVisibility(LinearLayout.VISIBLE);
                setting1.setVisibility(LinearLayout.INVISIBLE);
                break;
            case R.id.settingbutton:
                image1.setVisibility(LinearLayout.INVISIBLE);
                list1.setVisibility(LinearLayout.INVISIBLE);
                video1.setVisibility(LinearLayout.INVISIBLE);
                setting1.setVisibility(LinearLayout.VISIBLE);
                break;
        }
    }

}