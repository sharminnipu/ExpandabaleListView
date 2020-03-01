package com.sharmin.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


 private ExpandableListView expandableListView;
 private ExpandableListAdapter listAdapter;
 private List<String> listDataHeader;

 private HashMap<String,List<String>> listHashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView   =(ExpandableListView)findViewById(R.id.expandableListView);

        initData();

        listAdapter=new ExpandableListAdapter(this,listDataHeader,listHashMap);

        expandableListView.setAdapter(listAdapter);

       /* expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });  */


    }

    private void initData() {

        listDataHeader=new ArrayList<>();
        listHashMap=new HashMap<>();

        listDataHeader.add("Windows");
        listDataHeader.add("Android");
        listDataHeader.add("ISO");


        List<String> windows=new ArrayList<>();

        windows.add("this is windows 1");
        windows.add("this is windows 2");
        windows.add("this is windows 3");


        List<String>android=new ArrayList<>();

        android.add("this is android 1 ");
        android.add("this is android 2 ");
        android.add("this is android 3 ");


        List<String>iso=new ArrayList<>();

        iso.add("this is iso 1");
        iso.add("this is iso 2");
        iso.add("this is iso 3");


        listHashMap.put(listDataHeader.get(0),windows);
        listHashMap.put(listDataHeader.get(1),android);
        listHashMap.put(listDataHeader.get(2),iso);













    }
}
