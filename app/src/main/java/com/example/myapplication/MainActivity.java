package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView iv_open,iv_close;
    private boolean is_open=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        }

    private void init() {
        button=findViewById(R.id.button);
        iv_open=findViewById(R.id.iv_open);
        iv_close=findViewById(R.id.iv_close);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_open){
                    button.setText("开灯");
                    button.setBackgroundResource(R.drawable.btn_close);
                    iv_open.setVisibility(View.GONE);
                    iv_close.setVisibility(View.VISIBLE);
                    is_open=false;
                    Intent intent=new Intent(MainActivity.this,MyService.class);
                    stopService(intent);
                }else{
                    button.setText("关灯");
                    button.setBackgroundResource(R.drawable.btn_open);
                    iv_open.setVisibility(View.VISIBLE);
                    iv_close.setVisibility(View.GONE);
                    is_open=true;
                    Intent intent=new Intent(MainActivity.this,MyService.class);
                    startService(intent);
                }
            }
        });
    };
}
