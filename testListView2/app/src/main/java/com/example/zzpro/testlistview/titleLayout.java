package com.example.zzpro.testlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by zzpro on 2017/9/25.
 */

public class titleLayout extends LinearLayout {
    public titleLayout(Context context, AttributeSet attr) {
        super(context,attr);
        LayoutInflater.from(context).inflate(R.layout.customview,this);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"back",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.edit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"edit",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
