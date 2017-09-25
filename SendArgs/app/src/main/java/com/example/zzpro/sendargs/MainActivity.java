package com.example.zzpro.sendargs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView= (TextView) findViewById(R.id.textview);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                /*intent.putExtra("number","12");
                intent.putExtra("data","hello world");*/
               /* Bundle b=new Bundle();
                b.putInt("number",11);
                b.putString("data","hello world");
                intent.putExtras(b);

                intent.putExtra("user", new User("zz", 21));
                startActivity(intent);*/
               startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==1){
            textView.setText(data.getStringExtra("data"));
        }else{
            Toast.makeText(this,"send error",Toast.LENGTH_SHORT).show();
        }
    }
}
