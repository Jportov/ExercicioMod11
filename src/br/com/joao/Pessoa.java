package br.com.joao;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void mostrarDocumento();
}