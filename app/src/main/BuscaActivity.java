package com.erlon.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class BuscaActivity extends AppCompatActivity {

    private FormularioActivity fClass;
    private MainActivity mClass;
    private double etCalorias;
    private double etProteinas;
    private double etCarboidrato;
    private double etVitaminas;
    private double etSodio;
    private ArrayAdapter adapter2;
    private List<Alimento> ListadeAlimentos2;
    private ListView lvAlimentos2;
    private int tamanhoLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
        lvAlimentos2 = findViewById(R.id.lvAlimentos);
        fClass = new FormularioActivity();
        mClass = new MainActivity();
        etCalorias = fClass.returnCalorias();
        etCarboidrato = fClass.returnCarboidrato();
        etProteinas = fClass.returnProteinas();
        etVitaminas = fClass.returnVitaminas();
        etSodio = fClass.returnSodio();
        tamanhoLista = mClass.ListadeAlimentos.size();
        ListadeAlimentos2 = new ArrayList<>();
        CriarListaNova(etCalorias,etCarboidrato,etProteinas,etVitaminas,etSodio, tamanhoLista);
        adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListadeAlimentos2);
        lvAlimentos2.setAdapter(adapter2);
        FloatingActionButton fab = findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuscaActivity.this, FormularioActivity.class);
                intent.putExtra("acao", "inserir");
                startActivity(intent);
            }
        });
    }

    public void CriarListaNova(double Calorias, double Carboidrato, double Proteinas, double Vitaminas, double Sodio, int size){
        int c,c2, p, v, s;
        for (int i = 0; i < size; i++){
            c = 0;
            c2 = 0;
            p = 0;
            v = 0;
            s = 0;
            if (Calorias != 0 ){
                if (Calorias < mClass.ListadeAlimentos.get(i).calorias) {
                    c = 1;
                } else {
                    c = 0;
                }
            } else {
                c = 1;
            }
            if (Carboidrato != 0 ){
                if (Carboidrato < mClass.ListadeAlimentos.get(i).carboidrato) {
                    c2 = 1;
                } else {
                    c2 = 0;
                }
            } else {
                c2 = 1;
            }
            if (Proteinas != 0){
                if (Proteinas < mClass.ListadeAlimentos.get(i).proteinas) {
                    p = 1;
                } else {
                    p = 0;
                }
            } else {
                p = 1;
            }
            if (Vitaminas != 0) {
                if (Vitaminas < mClass.ListadeAlimentos.get(i).vitaminas) {
                    v = 1;
                } else {
                    v = 0;
                }
            } else {
                v = 1;
            }
            if (Sodio != 0){
                if(Sodio < mClass.ListadeAlimentos.get(i).sodio) {
                    s = 1;
                } else {
                    s = 0;
                }
            } else {
                s = 1;
            }
            if (c == 1 && c2 == 1 && p == 1 && v == 1 && s == 1){
                Alimento a1 = new Alimento(mClass.ListadeAlimentos.get(i).nome,mClass.ListadeAlimentos.get(i).calorias, mClass.ListadeAlimentos.get(i).carboidrato, mClass.ListadeAlimentos.get(i).proteinas, mClass.ListadeAlimentos.get(i).vitaminas, mClass.ListadeAlimentos.get(i).sodio);
                ListadeAlimentos2.add(a1);
            }
         }
    }
}
