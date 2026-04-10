package src.br.com.fiapride.model;

public class Componentes {

    private String cor;
    private String material;
    private int numeracao;
    private String mateiraldospratos;
    private String marca;
    private int numerodeBUmbos;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {

        if (numeracao >= 0) {
            this.numeracao = numeracao;
        } else {
            System.out.println("Erro: numeração não pode ser negativa.");
        }

    }
}