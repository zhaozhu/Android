package com.example.zzpro.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int SinglePrice=5;
    public int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Increment(View view){
        quantity++;
        DisplayNumber(quantity);
        DisplayPrice(quantity);
    }

    public void Decrement(View view){
        quantity--;
        DisplayNumber(quantity);
        DisplayPrice(quantity);
    }

    public void Order(View view){
        TextView Conclusion=(TextView) findViewById(R.id.Conclusion);
        Conclusion.setText("order successful");
    }

    public void DisplayPrice(int number){
        TextView Quantity= (TextView) findViewById(R.id.PriceNumber);
        int TotalPrice=number*SinglePrice;
        Quantity.setText(""+ TotalPrice);
    }

    public void DisplayNumber(int number){
        TextView Quantity= (TextView) findViewById(R.id.quantity);
        Quantity.setText(""+number);
    }
}
