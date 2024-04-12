package desafio;

public class Audio {
    private String titulo;
    private double duracao;
    private boolean curtida;
    private boolean reproducao;

    public void setAudio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }


    public boolean isCurtida() {
        return curtida;
    }

    public boolean isReproducao() {
        return reproducao;
    }



    public void curtir(){
        curtida = true;
        System.out.println("musica curtida!");
    }

    public void reproduzir(){
        reproducao = true;
        System.out.println("musica em reprodução!");
    }

}
//título, duração, total de reproduções, curtidas e classificação