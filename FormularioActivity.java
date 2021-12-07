package com.erlon.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;



public class FormularioActivity extends AppCompatActivity {

    private double etCalorias;
    private double etProteinas;
    private double etCarboidrato;
    private double etVitaminas;
    private double etSodio;
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
                Intent intent = new Intent(FormularioActivity.this, BuscaActivity.class);
                startActivity(intent);

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
            etCalorias = Double.parseDouble(Calorias2);
        }
        if (Proteinas2.isEmpty()) {
            etProteinas = 0;
        }else {
            etProteinas = Double.parseDouble(Proteinas2);
        }
        if (Carboidrato2.isEmpty()) {
            etCarboidrato = 0;
        }else{
            etCarboidrato = Double.parseDouble(Carboidrato2);
        }
        if (Vitaminas2.isEmpty()){
            etVitaminas = 0;
        }else{
            etVitaminas = Double.parseDouble(Proteinas2);
        }
        if (Sodio2.isEmpty()){
            etSodio = 0;
        }else{
            etSodio = Double.parseDouble(Sodio2);
        }

    }

    public double returnCalorias(){
        return etCalorias;
    }

    public double returnCarboidrato(){
        return etCarboidrato;
    }

    public double returnProteinas(){
        return etProteinas;
    }

    public double returnVitaminas(){
        return etVitaminas;
    }

    public double returnSodio(){
        return etSodio;
    }


}


