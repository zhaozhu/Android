package com.example.zzpro.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*private String[] data={"apple","orange","watermelon","pear",
    "grape","pineapple","strawberry","cherry","mango","banana",
            "apple","orange","watermelon","pear",
            "grape","pineapple","strawberry","cherry","mango","banana"};*/

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ArrayAdapter<String> fruit=new
                ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        ListView listview =(ListView)findViewById(R.id.listview);
        listview.setAdapter(fruit);*/
        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(new MyAdapter());

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,""+i,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private class MyAdapter extends BaseAdapter{
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView textView;
            if(view==null){
                textView=new TextView(MainActivity.this);
            }else{
                textView=(TextView)view;
            }
            textView.setText("zz"+i);
            return textView;
        }

        @Override
        public long getItemId(int i) {
            return i+1;
        }

        @Override
        public int getCount(){
            return 1000000000;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }
    }
}
