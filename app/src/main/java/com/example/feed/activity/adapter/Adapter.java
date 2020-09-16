package com.example.feed.activity.adapter;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feed.R;
import com.example.feed.activity.model.Servico;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Servico> listaServico;
    public Adapter(List<Servico> lista) {
        this.listaServico = lista;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Servico servico = listaServico.get( position );
        holder.titulo.setText(servico.getTituloServico());
        holder.cidade.setText(servico.getCidade());
        holder.data.setText(servico.getData());

    }

    @Override
    public int getItemCount() {
        return listaServico.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView titulo;
        TextView data;
        TextView cidade;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            data = itemView.findViewById(R.id.textData);
            cidade = itemView.findViewById(R.id.textCidade);
        }
    }
}
