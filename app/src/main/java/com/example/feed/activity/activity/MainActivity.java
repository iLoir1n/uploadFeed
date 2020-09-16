package com.example.feed.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.feed.R;
import com.example.feed.activity.adapter.Adapter;
import com.example.feed.activity.model.Servico;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Servico> listaServico =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Servicos
        this.criarServico();


        //Configurar adapter
        Adapter adapter = new Adapter(listaServico);


        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );
    }

    public void criarServico(){
        Servico servico = new Servico("Ter domínio do Excel","Pádua", "12/09/2020");
        this.listaServico.add(servico);

        servico = new Servico("Fazer compras", "Itaperuna", "20/09/2020");
        listaServico.add(servico);

        servico = new Servico("Consertar vazamento", "Aperibé", "10/10/2020");
        listaServico.add(servico);

        servico = new Servico("Limpar terreno", "Miracema", "30/09/2020");
        listaServico.add(servico);

        servico = new Servico("Desenvolver pagina web", "Itaperuna", "25/09/2020");
        listaServico.add(servico);

        servico = new Servico("Contruir casa na árvore", "Itaperuna", "19/10/2020");
        listaServico.add(servico);

        servico = new Servico("Formatar computador", "Aperibé", "22/09/2020");
        listaServico.add(servico);

        servico = new Servico("Lavar roupas", "Itaocara", "22/10/2020");
        listaServico.add(servico);

        servico = new Servico("Tocar guitarra", "Itaperuna", "27/09/2020");
        listaServico.add(servico);

        servico = new Servico("Desenvolver apps", "Itaperuna", "20/09/2020");
        listaServico.add(servico);
    }

}


