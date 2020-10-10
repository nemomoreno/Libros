package com.example.libros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaLibros extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_libros);
        lista = findViewById(R.id.lstlibros);
        final ArrayList<Libros> myList = (ArrayList<Libros>) getIntent().getSerializableExtra("mylist");

        ArrayAdapter<Libros> adapter = new ArrayAdapter<Libros>(this,android.R.layout.simple_list_item_1,myList);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), myList.get(position).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }



}