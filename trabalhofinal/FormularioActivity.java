package com.erlon.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;



public class FormularioActivity extends AppCompatActivity {

    private float etCalorias;
    private float etProteinas;
    private float etCarboidrato;
    private float etVitaminas;
    private float etSodio;
    private EditText Calorias;
    private EditText Proteinas;
    private EditText Carboidrato;
    private EditText Vitaminas;
    private EditText Sodio;
    private Button btnSalvar;
    private String acao;
    private Alimento alimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Calorias = findViewById(R.id.etcalorias);
        Proteinas = findViewById(R.id.etProteinas);
        Carboidrato = findViewById(R.id.etCarboidrato);
        Vitaminas = findViewById(R.id.etVitaminas);
        Sodio = findViewById(R.id.etSodio);
        btnSalvar = findViewById(R.id.btnSalvar);
        acao = getIntent().getStringExtra("acao");
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });
    }

    private void salvar(){
        String Calorias2 = Calorias.getText().toString();
        String Proteinas2 = Proteinas.getText().toString();
        String Carboidrato2 = Carboidrato.getText().toString();
        String Vitaminas2 = Vitaminas.getText().toString();
        String Sodio2 = Sodio.getText().toString();
        if (Calorias2.isEmpty()) {
            etCalorias = 0;
        }else {
            etCalorias = Float.parseFloat(Calorias2);
        }
        if (Proteinas2.isEmpty()) {
            etProteinas = 0;
        }else {
            etProteinas = Float.parseFloat(Proteinas2);
        }
        if (Carboidrato2.isEmpty()) {
            etCarboidrato = 0;
        }else{
            etCarboidrato = Float.parseFloat(Carboidrato2);
        }
        if (Vitaminas2.isEmpty()){
            etVitaminas = 0;
        }else{
            etVitaminas = Float.parseFloat(Vitaminas2);
        }
        if (Sodio2.isEmpty()){
            etSodio = 0;
        }else{
            etSodio = Float.parseFloat(Sodio2);
        }

    }
}


