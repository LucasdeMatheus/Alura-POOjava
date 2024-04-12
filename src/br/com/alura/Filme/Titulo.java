package br.com.alura.Filme;

public abstract class Titulo {
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliações;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;




        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setSomaDasAvaliações(double somaDasAvaliações) {
            this.somaDasAvaliações = somaDasAvaliações;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void avalia(double nota){
            somaDasAvaliações += nota;
            totalDeAvaliacoes++;;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public double getSomaDasAvaliações() {
            return somaDasAvaliações;
        }

        public int getTotalDeAvaliacoes() {
            return totalDeAvaliacoes;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public double pegaMedia(){
            return  somaDasAvaliações / totalDeAvaliacoes;
        }

    public abstract int getClassificacao();
}
