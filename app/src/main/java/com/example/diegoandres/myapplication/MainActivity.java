package com.example.diegoandres.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Vista1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vista1 = (TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Vista1.setText("Cambio el texto oprimiendo el boton");
    }
}
