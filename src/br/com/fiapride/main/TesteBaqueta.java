package src.br.com.fiapride.main;

import src.br.com.fiapride.model.Componentes;

public class TesteBaqueta {

    public static void main(String[] args) {

        Componentes b1 = new Componentes();

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