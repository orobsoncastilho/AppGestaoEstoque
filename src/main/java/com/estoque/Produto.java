package com.estoque;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Produto {

    private final StringProperty nome;
    private final SimpleIntegerProperty quantidade;
    private final StringProperty codigo;

    public Produto(String nome, int quantidade, String codigo) {
        this.nome = new SimpleStringProperty(nome);
        this.quantidade = new SimpleIntegerProperty(quantidade);
        this.codigo = new SimpleStringProperty(codigo);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public int getQuantidade() {
        return quantidade.get();
    }

    public void setQuantidade(int quantidade) {
        this.quantidade.set(quantidade);
    }

    public String getCodigo() {
        return codigo.get();
    }

    public void setCodigo(String codigo) {
        this.codigo.set(codigo);
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public SimpleIntegerProperty quantidadeProperty() {
        return quantidade;
    }

    public StringProperty codigoProperty() {
        return codigo;
    }
}
