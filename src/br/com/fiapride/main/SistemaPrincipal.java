//package br.com.fiapride.main;

 // Importamos a classe Passageiro para que o sistema a reconheça
 //import br.com.fiapride.model.Passageiro;

// public class SistemaPrincipal {
	//public static void main(String[] args) {
		 // INSTANCIAÇÃO
		 // Criando o primeiro passageiro (Objeto 1)
		 //Passageiro passageiro1 = new Passageiro();
		 //passageiro1.nome = "Ana Silva";
		 //passageiro1.saldo = 50.0;
		
		 // Criando o segundo passageiro (Objeto 2)
		 //Passageiro passageiro2 = new Passageiro();
		 //passageiro2.nome = "Carlos Souza";
		// passageiro2.saldo = 12.50;
		
//		System.out.println("--- Sistema FiapRide ---");
//		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		
		//System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
		
		 // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
		// }
//}
//------------------------------------------------^ PASSAGEIROS ^-------------------------------------------------------------------------------  

package br.com.fiapride.main;

import br.com.fiapride.model.Baqueta;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instanciando baquetas
        Baqueta minhaBaqueta = new Baqueta();
        minhaBaqueta.cor = "Azul";
        minhaBaqueta.material = "Madeira";
        minhaBaqueta.numeracao = 5;

        Baqueta baquetaDoProfessor = new Baqueta();
        baquetaDoProfessor.cor = "Branca";
        baquetaDoProfessor.material = "Fibra";
        baquetaDoProfessor.numeracao = 7;

        // Testando métodos
        minhaBaqueta.trocarCor("Vermelha");      // válido
        minhaBaqueta.trocarCor("");               // inválido
        baquetaDoProfessor.aumentarNumeracao(3); // válido
        baquetaDoProfessor.aumentarNumeracao(-1);// inválido

        // Mostrar resultados
        System.out.println("Minha baqueta: " + minhaBaqueta.cor + ", numeração " + minhaBaqueta.numeracao);
        System.out.println("Baqueta do professor: " + baquetaDoProfessor.cor + ", numeração " + baquetaDoProfessor.numeracao);
    }
}