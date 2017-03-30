package com.sjw.studentmanagersystem.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sjw.studentmanagersystem.R;

public class MainActivity extends AppCompatActivity {
    private Button btn_add = (Button) findViewById(R.id.btn_stu_add);
    private Button btn_view = (Button) findViewById(R.id.btn_stu_view);
    private Button btn_edit = (Button) findViewById(R.id.btn_stu_edit);
    private Button btn_exit = (Button) findViewById(R.id.btn_exit);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DEBUG","onCreate");
        btn_add = (Button) findViewById(R.id.btn_stu_add);
        btn_view = (Button) findViewById(R.id.btn_stu_view);
        btn_edit = (Button) findViewById(R.id.btn_stu_edit);
        btn_exit = (Button) findViewById(R.id.btn_exit);

        /**
         * 添加按钮点击监听器
         */
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 查看按钮点击监听器
         */
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ViewActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 编辑按钮点击监听器
         */
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,EditActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 退出按钮点击监听器
         */
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }



}
