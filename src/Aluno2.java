public class Aluno2 {
    private String nome;
    private double notas;
    private double totalNotas;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double notas) {
        this.notas = notas;
    }

    public void adicionarNotas(double nota){
        notas = notas + nota;
        totalNotas++;
    }

    public void calcularMedia(){
        double média = notas / totalNotas;
        System.out.println("\n\nnota final: " + notas + "\nmédia: " + média);
    }
}
