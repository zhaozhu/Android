package com.example.zzpro.startcontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText= (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        textView.setText(((App)getApplicationContext()).getTextData());

        findViewById(R.id.btnSavaData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((App)getApplicationContext()).setTextData(editText.getText().toString());
                textView.setText(((App)getApplicationContext()).getTextData());
            }
        });
    }
}
