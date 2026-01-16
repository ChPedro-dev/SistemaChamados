package com.pedroch_dev.sistema_chamados.model;

public class Chamado {
    
    int id;
    String titulo;
    String descricao;
    String status;
    String prioridade;
    String dataAbertura;
    String dataFechamento;
    int idUsuario;

    public Chamado() {
    }

    public Chamado(int id, String titulo, String descricao, String status, String prioridade, String dataAbertura, String dataFechamento, int idUsuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id){
        this.idUsuario = id;
    }

}
