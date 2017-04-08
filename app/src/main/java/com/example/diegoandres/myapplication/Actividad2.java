package com.example.diegoandres.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity implements View.OnClickListener
{
    RadioGroup container;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        container = (RadioGroup) findViewById(R.id.radiogroup);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);

        container.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    Toast.makeText(getApplicationContext(),"Usted Oprimio el boton 1", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"Usted Oprimio el boton 2", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radioButton3) {
                    Toast.makeText(getApplicationContext(),"Usted Oprimio el boton 3", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radioButton4) {
                    Toast.makeText(getApplicationContext(),"Usted Oprimio el boton 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        super.onBackPressed();
    }
}
