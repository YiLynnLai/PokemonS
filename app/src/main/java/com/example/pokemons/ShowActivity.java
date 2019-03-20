package com.example.pokemons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView tv_name;
    private TextView bag1;
    private Button mon_1;

    private int totalCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        //获得Inten对象
        Intent intent=getIntent();
        //取出key对应的value值
        String name=intent.getStringExtra("name");
        tv_name=(TextView)findViewById(R.id.tv_name);
        tv_name.setText("Host:"+name);
        bag1=findViewById(R.id.bag1);
        mon_1=findViewById(R.id.mon_1);
        //button监听，实行加一操作
        mon_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalCount++;
                bag1.setText(String.valueOf(totalCount));
            }
        });


    }
}
