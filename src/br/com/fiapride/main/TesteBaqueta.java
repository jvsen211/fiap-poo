package br.com.fiapride.main;

import br.com.fiapride.model.Baqueta;

public class TesteBaqueta {

    public static void main(String[] args) {

        Baqueta b1 = new Baqueta();

        b1.setCor("Preta");
        b1.setMaterial("Madeira");

        b1.setNumeracao(5);

        // tentativa de quebrar a regra
        b1.setNumeracao(-3);

        System.out.println("Cor: " + b1.getCor());
        System.out.println("Material: " + b1.getMaterial());
        System.out.println("Numeração: " + b1.getNumeracao());
    }
}