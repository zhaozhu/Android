package com.example.zzpro.testview;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressbar=(ProgressBar)findViewById(R.id.progressbar_1);
    }

    public void Test_ProgressBar(View v){
        if(v.getId()==R.id.button_1){
            progressbar.setVisibility(View.VISIBLE);
            int progress=progressbar.getProgress();
            progress+=5;
            progressbar.setProgress(progress);
        }
    }

    public void Test_AlertDialog(View v){
        if(v.getId()==R.id.button_2){
            AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("test alert_dialog");
            dialog.setMessage("test Alert_Dialog");
            dialog.setCancelable(false);
            dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            dialog.show();
        }
    }

    public void Test_ProgressDialog(View v){
        if(v.getId()==R.id.button_3){
            ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
            progressDialog.setTitle("something is running");
            progressDialog.setMessage("loading...");
            progressDialog.setCancelable(true);
            progressDialog.show();
        }
    }
}
