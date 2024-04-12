package desafio;
import java.util.Scanner;

public class Musica extends Audio {
    Scanner leitura = new Scanner(System.in);


    private String genero;
    private String album;
    private String artista;

    public void inicial(){
        System.out.println("""
                Titulo: %s,
                Duracao: %s
                curtida: %s
                Reproducao: %s
                genero: %s
                album: %s
                artista: %s
                """.formatted(getTitulo(), getDuracao(), isCurtida(), isReproducao(), getGenero(), getAlbum(), getArtista()));
        System.out.println("\n0: sair\n1:reproduzir\n2: curtir");

    }

    public void setMusica(String genero, String album, String artista) {
        this.genero = genero;
        this.album = album;
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }
}
