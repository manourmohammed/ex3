package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button somme,deffirence,produit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        somme=findViewById(R.id.somme);
        deffirence=findViewById(R.id.deffirence);
        produit=findViewById(R.id.produit);
        setTitle("EX03-choix");
        somme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("aze","+");
                startActivity(intent);


            }
        });
        deffirence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("aze","-");
                startActivity(intent);

            }
        });
        produit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("aze","*");
                startActivity(intent);

            }
        });




    }
}