package br.com.alura.Filme.calcular;

import br.com.alura.Filme.Filme;
import br.com.alura.Filme.Serie;
import br.com.alura.Filme.Titulo;

public class Calcular {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
