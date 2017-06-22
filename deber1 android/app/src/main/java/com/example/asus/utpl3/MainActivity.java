package com.example.asus.utpl3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_nuevo;
    Button btn_nuevo2;
    Button btn_nuevo3;
    Button btn_nuevo4;
    Button btn_nuevo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_nuevo=(Button) findViewById(R.id.bt1);
        btn_nuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, nueva.class);
                startActivity(intent);
            }
        });

        btn_nuevo2=(Button) findViewById(R.id.bt2);
        btn_nuevo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, sincronizar.class);
                startActivity(intent);
            }
        });

        btn_nuevo3=(Button) findViewById(R.id.bt3);
        btn_nuevo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, listar.class);
                startActivity(intent);
            }
        });

        btn_nuevo4=(Button) findViewById(R.id.bt4);
        btn_nuevo4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, camara.class);
                startActivity(intent);
            }
        });

        btn_nuevo5=(Button) findViewById(R.id.bt5);
        btn_nuevo5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, informacion.class);
                startActivity(intent);
            }
        });







    }

}
