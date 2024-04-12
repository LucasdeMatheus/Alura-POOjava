package Calculavel;

public class ProdutoFisico implements Calculavel {
    double preco;
    double juros;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + preco * juros;
    }
}
