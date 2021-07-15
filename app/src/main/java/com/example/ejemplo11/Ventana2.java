package com.example.ejemplo11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Ventana2 extends AppCompatActivity {

    EditText edtNombre, edtApellido1, edtApellido2, edtTelefono, edtEmail;
    RadioButton rdbSocioS, rdbSocioN, rdbMenorS, rdbMenorN, rdbResidenciaS, rdbResidenciaN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        edtNombre = findViewById(R.id.edtNombre);
        edtApellido1 = findViewById(R.id.edtApellido1);
        edtApellido2 = findViewById(R.id.edtApellido2);
        edtTelefono = findViewById(R.id.edtTelefono);
        edtEmail = findViewById(R.id.edtEmail);
        rdbSocioS = findViewById(R.id.rdbSi);
        rdbSocioN = findViewById(R.id.rdbNo);
        rdbMenorS = findViewById(R.id.rdbSiM);
        rdbMenorN = findViewById(R.id.rdbNoM);
        rdbResidenciaS = findViewById(R.id.rdbSiR);
        rdbResidenciaN = findViewById(R.id.rdbNoR);

    }

    public void mostrarSocio(View view){

        String edtNombreValue = edtNombre.getText().toString();
        String edtApellido1Value = edtApellido1.getText().toString();
        String edtApellido2Value = edtApellido2.getText().toString();
        String edtTelefonoValue = edtTelefono.getText().toString();
        String edtEmailValue = edtEmail.getText().toString();

        SocioRM dataCourse = new SocioRM();

        dataCourse.setNombre(edtNombreValue);
        dataCourse.setApellido1(edtApellido1Value);
        dataCourse.setApellido2(edtApellido2Value);
        dataCourse.setTelefono(edtTelefonoValue);
        dataCourse.setEmail(edtEmailValue);

        if (rdbSocioS.isChecked()){
            dataCourse.setSocio(rdbSocioS.getText().toString());
        }else {
            dataCourse.setSocio(rdbSocioN.getText().toString());
            }

        if (rdbMenorS.isChecked()){
            dataCourse.setMenor(rdbMenorS.getText().toString());
        }else {
            dataCourse.setMenor(rdbMenorN.getText().toString());
        }

        if (rdbResidenciaS.isChecked()){
            dataCourse.setResidencia(rdbResidenciaS.getText().toString());
        }else {
            dataCourse.setResidencia(rdbResidenciaN.getText().toString());
        }

        Intent i = new Intent(this, Ventana3.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("data", dataCourse);
        i.putExtras(bundle);
        startActivity(i);

    }
}