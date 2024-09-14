package br.com.joao;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "12.345.678/0001-00");

        pf.mostrarDocumento();  // Mostra o CPF
        pj.mostrarDocumento();  // Mostra o CNPJ
    }
}