package com.example.ejemplo11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logo = (ImageView)findViewById(R.id.imageView3);
        logo.setImageResource(R.drawable.carnetmadridista);
    }

    public void entrarFormulario(View view){

        Intent i = new Intent(this, Ventana2.class );
        startActivity(i);

    }

}