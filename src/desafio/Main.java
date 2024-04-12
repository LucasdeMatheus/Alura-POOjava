package desafio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Musica music1 = new Musica();
        music1.setMusica("Trap", "17", "XXXTENTACION e Trippie Redd");
        music1.setAudio("Fuck Love", 2.26);

        music1.inicial();
        int opcao = 3;
        while(opcao != 0){
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("reproduzindo");
            }else if(opcao == 2) {
                System.out.println("curtida");
            }
        }
    }
}
