package br.com.digitalhouse.listacontato.view;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.digitalhouse.listacontato.adapter.ContatoAdapter;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.listacontato.R;
import br.com.digitalhouse.listacontato.model.Contatos;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewContatos;
    ContatoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewContatos = findViewById(R.id.listaContatosRecyclerView);

        adapter = new ContatoAdapter(listaDeContatos());

        recyclerViewContatos.setAdapter(adapter);
        recyclerViewContatos.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Contatos> listaDeContatos(){
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("Jessica", 12341234));
        contatos.add(new Contatos("Tairo", 23452345));
        contatos.add(new Contatos("Eduardo", 34563456));
        contatos.add(new Contatos("Ivan", 45674567));
        contatos.add(new Contatos("Gabriel T.", 56785678));
        contatos.add(new Contatos("Marcelo", 56785678));
        contatos.add(new Contatos("Luca", 67896789));
        contatos.add(new Contatos("Mayara", 78907890));

        return contatos;
    }
}
