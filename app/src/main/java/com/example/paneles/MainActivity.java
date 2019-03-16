package com.example.paneles;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  int[ ] rojo = {R.color.rojo, R.color.rojo2, R.color.rojo3, R.color.rojo4, R.color.rojo5, R.color.rojo6};
    private  int[ ] verde = {R.color.verde, R.color.verde2, R.color.verde3, R.color.verde4, R.color.verde5, R.color.verde6};
    private  int[ ] azul = {R.color.azul, R.color.azul2, R.color.azul3, R.color.azul4, R.color.azul5, R.color.azul6};
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        int numero;
        switch (viewId){
            case R.id.btn1:
                numero = (int) (Math.random() * 5) + 1;
                btn1.setBackgroundColor(getResources().getColor(rojo[numero]));
                break;
            case R.id.btn2:
                numero = (int) (Math.random() * 5) + 1;
                btn2.setBackgroundColor(getResources().getColor(verde[numero]));
                break;
            case R.id.btn3:
                numero = (int) (Math.random() * 5) + 1;
                btn3.setBackgroundColor(getResources().getColor(azul[numero]));
                break;
        }
    }
}
