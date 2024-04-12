package Carro;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;
    private double maior;
    private double menor;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;

    }

    public void calcularPreco(){
        if(getPreco1() > getPreco2() && getPreco1() > getPreco3()){
            maior = getPreco1();
        }else{
            menor = getPreco1();
        }
        if(getPreco2() > getPreco1() && getPreco2() > getPreco3()){
            maior = getPreco2();
        }else{
            menor = getPreco2();
        }
        if(getPreco3() > getPreco1() && getPreco3() > getPreco2()){
            maior = getPreco3();
        }else{
            menor = getPreco3();
        }
    }
    public void exibirModelo(){
        System.out.println("""
                Modelo: %s
                Preço ano 1: %.2f
                Preço ano 2: %.2f
                Preço ano 3: %.2f
                Maior ano: %.2f
                Menor ano: %.2f
                """.formatted(getModelo(), getPreco1(), getPreco2(), getPreco3(), getMaior(), getMenor()));
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public double getMaior() {
        return maior;
    }

    public double getMenor() {
        return menor;
    }
}
