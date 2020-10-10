package com.example.libros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> libro = new ArrayList<String>();
    ArrayList<Libros> libro2 = new ArrayList<Libros>();

    EditText editText, editText3, editText8;
    Button Guardar, Cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText3 = findViewById(R.id.editText3);
        editText8 = findViewById(R.id.editText8);
    }

    public void OnClickGuardar(View view){
        String isbn = editText.getText().toString();
        String titulo = editText3.getText().toString();
        String autor = editText8.getText().toString();

        Libros l=new Libros(isbn, titulo, autor);
        libro2.add(l);
        Toast.makeText(getApplicationContext(), "Libro guardado",Toast.LENGTH_LONG).show();
        editText.setText("");
        editText3.setText("");
        editText8.setText("");
    }

    public void OnClickCancelar(View view){
        editText.setText("");
        editText3.setText("");
        editText8.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.menulibros:
                Intent i = new Intent(this, ListaLibros.class);
                i.putExtra("mylist", libro2);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}