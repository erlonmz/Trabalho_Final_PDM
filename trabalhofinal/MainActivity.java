package com.erlon.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.erlon.trabalhofinal.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvAlimentos;
    private ArrayAdapter adapter;
    private List<Alimento> ListadeAlimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lvAlimentos = findViewById(R.id.lvAlimentos);
        carregarAlimentos();

        FloatingActionButton fab = findViewById(R.id.fab);
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
        Alimento a1 = new Alimento("Hamburguer",1,1,1,1,1);
        Alimento a2 = new Alimento("Carne",1,1,1,1,1);
        Alimento a3 = new Alimento("Pizza",1,1,1,1,1);
        Alimento a4 = new Alimento("Batata-Doce",1,1,1,1,1);
        Alimento a5 = new Alimento("Bolo",1,1,1,1,1);
        Alimento a6 = new Alimento("Hamburguer",1,1,1,1,1);
        Alimento a7 = new Alimento("Frango Grelhado",1,1,1,1,1);
        Alimento a8 = new Alimento("Bauru",1,1,1,1,1);
        Alimento a9 = new Alimento("Chocolate",1,1,1,1,1);
        Alimento a10 = new Alimento("Arroz Integral",1,1,1,1,1);
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