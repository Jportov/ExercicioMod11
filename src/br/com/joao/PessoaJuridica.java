package br.com.joao;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome); // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void mostrarDocumento() {
        System.out.println("CNPJ: " + cnpj);
    }
}
