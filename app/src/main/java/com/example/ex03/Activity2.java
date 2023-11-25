package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Activity2 extends AppCompatActivity {
    EditText ed_1,ed_2;
    TextView textView;
    Button Resultat,back;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ed_1=findViewById(R.id.ed_1);
        ed_2=findViewById(R.id.ed_2);
        textView=findViewById(R.id.textView);
        Resultat=findViewById(R.id.rst);
        back=findViewById(R.id.back);
        setTitle("EX03-Resultat");
        textView.setText(getIntent().getStringExtra("aze"));
        Resultat.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                try {
                    double ed1=Double.parseDouble(ed_1.getText().toString()),ed2=Double.parseDouble(ed_2.getText().toString());
                    if (textView.getText().toString().equals("+")){
                        double a=ed1+ed2;
                        Toast.makeText(Activity2.this, String.format("%.2f+%.2f=%.2f",ed1,ed2,a), Toast.LENGTH_SHORT).show();
                    }else if (textView.getText().toString().equals("-")){
                        double a=ed1-ed2;
                        Toast.makeText(Activity2.this, String.format("%.2f-%.2f=%.2f",ed1,ed2,a), Toast.LENGTH_SHORT).show();
                    }else {
                        double a=ed1*ed2;
                        Toast.makeText(Activity2.this, String.format("%.2f*%.2f=%.2f",ed1,ed2,a), Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Snackbar.make(Resultat,"vide ou ne sont pas des numbers",Snackbar.LENGTH_SHORT).show();

                }
            }
        });


back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
    }
});



    }

}