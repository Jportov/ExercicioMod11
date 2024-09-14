package br.com.joao;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome); // Chama o construtor da classe Pessoa
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void mostrarDocumento() {
        System.out.println("CPF: " + cpf);
    }
}

