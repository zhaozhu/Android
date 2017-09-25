package com.example.zzpro.zz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"加",Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"减",Toast.LENGTH_LONG).show();
                break;
            case R.id.multiply_item:
                Toast.makeText(this,"乘",Toast.LENGTH_LONG).show();
                break;
            case R.id.divide_item:
                Toast.makeText(this,"除",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
