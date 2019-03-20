package com.example.pokemons;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_name;
    private EditText et_password;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=(EditText)findViewById(R.id.et_name);
        et_password=(EditText)findViewById(R.id.et_psw);
        btn_send=(Button)findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passDate();

            }
        });
    }
    public void passDate(){
        Intent intent=new Intent(this,ShowActivity.class);
        intent.putExtra("name",et_name.getText().toString().trim());
        startActivity(intent);
    }

}
