import br.com.alura.Filme.Episodio;
import br.com.alura.Filme.Filme;
import br.com.alura.Filme.Serie;
import br.com.alura.Filme.calcular.Calcular;
import br.com.alura.Filme.calcular.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();

        Filme meuFilme = new Filme();
        meuFilme.setNome("Taxi Driver");
        meuFilme.setAnoDeLancamento(1976);
        meuFilme.setDuracaoEmMinutos(112);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(4.5);
        meuFilme.avalia(8);
        meuFilme.exibirFilme();

        System.out.println("\n***************************************\n");
        Serie serie1 = new Serie();
        serie1.setNome("Better call Saul");
        serie1.setAnoDeLancamento(2015);
        serie1.setTemporada(5);
        serie1.setMinutosPorEpisodio(60);
        serie1.setIncluidoNoPlano(true);
        serie1.setEpsodioporTemporada(11);
        serie1.setAtiva(false);
        serie1.exibirSerie();

        calcular.inclui(serie1);
        calcular.inclui(meuFilme);
        System.out.println("\n\n" + calcular.getTempoTotal() + "min");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);
    }
}
