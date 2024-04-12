package br.com.alura.Filme;

import br.com.alura.Filme.calcular.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public void exibirFilme(){
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Avaliacao: " + pegaMedia());
        System.out.println("Total de Avaliacoes: " + getTotalDeAvaliacoes());
        System.out.println("Duração: " + getDuracaoEmMinutos() + "min");
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }
}