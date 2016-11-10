package com.example.administrator.p20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
WordsDBHelper mDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list=(ListView)findViewById(R.id.lstWords);
        registerForContextMenu(list);

        mDbHelper=new WordsDBHelper(this);

        ArrayList<Map<String,String>> items=getAll();
        setWordsListView(items);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mDbHelper.close();
    }
}
