package com.erlon.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvAlimentos;
    private ArrayAdapter adapter;
    public List<Alimento> ListadeAlimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lvAlimentos = findViewById(R.id.lvAlimentos);
        carregarAlimentos();

        FloatingActionButton fab = findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
                intent.putExtra("acao", "inserir");
                startActivity(intent);
            }
        });
    }

    private void carregarAlimentos(){
        Alimento a1 = new Alimento("Arroz integral 50 g",3.8,37,172,0,0);
        Alimento a2 = new Alimento("Chocolate Nestle 25 g",1.6,13,124,0,0);
        Alimento a3 = new Alimento("Panetone 80g",6.6,38,286,133,0);
        Alimento a4 = new Alimento("Batata-Doce",0.42,12.88,53.90,2.10,0);
        Alimento a5 = new Alimento("Pao Integral Fatia",6.9,17,116,181,0);
        Alimento a6 = new Alimento("Leite 1 Copo",6,9,114,130,0);
        Alimento a7 = new Alimento("Frango 120 g",27,1,125,59,0);
        Alimento a8 = new Alimento("Feijao 60 g",14,36,205,15,0);
        Alimento a9 = new Alimento("Arroz Parboilizado 50 g",3.5,40,175,0,0);
        Alimento a10 = new Alimento("Coca-Cola 1 Copo",0,15,60,10,0);
        ListadeAlimentos = new ArrayList<>();
        ListadeAlimentos.add(a1);
        ListadeAlimentos.add(a2);
        ListadeAlimentos.add(a3);
        ListadeAlimentos.add(a4);
        ListadeAlimentos.add(a5);
        ListadeAlimentos.add(a6);
        ListadeAlimentos.add(a7);
        ListadeAlimentos.add(a8);
        ListadeAlimentos.add(a9);
        ListadeAlimentos.add(a10);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListadeAlimentos);
        lvAlimentos.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}