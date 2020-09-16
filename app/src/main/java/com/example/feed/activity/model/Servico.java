package com.example.feed.activity.model;

public class Servico {

    //possível erro
    private String tituloServico;
    private String cidade;
    private String data;

    public Servico(){

    }

    public String getTituloServico() {
        return tituloServico;
    }

    public void setTituloServico(String tituloServico) {
        this.tituloServico = tituloServico;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Servico(String tituloServico, String cidade, String data) {
        this.tituloServico = tituloServico;
        this.cidade = cidade;
        this.data = data;




    }
}
