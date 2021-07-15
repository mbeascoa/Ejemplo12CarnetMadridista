package com.example.ejemplo11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana3 extends AppCompatActivity {

    TextView lblNombre, lblApellidos, lblTelefono, lblEmail, lblSocio, lblMenor, lblResidencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3);

        lblNombre = (TextView)findViewById(R.id.lblNombre);
        lblApellidos = (TextView)findViewById(R.id.lblApellidos);
        lblEmail = (TextView)findViewById(R.id.lblEmail);
        lblTelefono = (TextView)findViewById(R.id.lblTelefono);
        lblSocio = (TextView)findViewById(R.id.lblSocio);
        lblMenor = (TextView)findViewById(R.id.lblMenor);
        lblResidencia = (TextView)findViewById(R.id.lblResidencia);


        Intent inta = getIntent();
        SocioRM data = (SocioRM) inta.getSerializableExtra("data");

        lblNombre.setText(data.getNombre());

        String apellido1 = data.getApellido1();
        String apellido2 = data.getApellido2();
        lblApellidos.setText(apellido1 + " " + apellido2);

        lblTelefono.setText(data.getTelefono());
        lblEmail.setText(data.getEmail());
        lblSocio.setText(data.getSocio());
        lblMenor.setText(data.getMenor());

        lblResidencia.setText(data.getResidencia());

    }


    public void closeWindow(View view) {
        finish();
    }
}
