import java.util.Scanner;
public class Musica {
    Scanner leitura = new Scanner(System.in);

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFicha(){
        System.out.println("""
                **************************************************
                Titulo: %s
                artista: %s
                anoDeLancamento: %d
                avaliacao: %.2f
                numAvaliacao: %d
                
                """.formatted(titulo, artista, anoDeLancamento, avaliacao, numAvaliacao));
    }

    void avaliar(){
        System.out.println("\nAvalie:\n(digite 1,0 para sair ");
        double nota = leitura.nextDouble();
        if (nota == 1.0){
            exibirAvaliacao();
            return;
        }else{
            avaliacao += nota;
            numAvaliacao++;
            avaliar();
        }

    }
    double exibirAvaliacao(){
        return avaliacao = avaliacao/ numAvaliacao;
    }
}
