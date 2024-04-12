import java.util.Scanner;

public class Aluno {
    Scanner leitura = new Scanner(System.in);

    String nome;
    int idade;

    void exibirFicha(){
        System.out.println("""
                ********************************************************
                                        Aluno 1
                
                Nome: %s
                Idade: %d
                """.formatted(nome,idade));
    }

    void preencherInformações(){
        System.out.println("Informe o nome do aluno:\n ");
        nome = leitura.nextLine();
        System.out.println("Informe a idade do aluno:\n ");
        idade = leitura.nextInt();
        exibirFicha();
    }
}
