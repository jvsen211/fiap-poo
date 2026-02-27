package br.com.fiapride.model;

public class Baqueta {

    public String cor;
    public String material;
    public int numeracao;

    // Método para trocar a cor
    public void trocarCor(String novaCor) {
        if (novaCor != null && !novaCor.isEmpty()) {
            cor = novaCor;
        } else {
            System.out.println("Cor inválida!");
        }
    }

    // Método para aumentar a numeração
    public void aumentarNumeracao(int incremento) {
        if (incremento > 0) {
            numeracao += incremento;
        } else {
            System.out.println("Incremento inválido!");
        }
    }
}