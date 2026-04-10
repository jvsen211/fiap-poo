package src.br.com.fiapride.model;

public class Bateria extends Componentes {

    private String modelo;
    private String Tipo;
    private int numeroPratos;
    private int numerodeTambores;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getNumeroPratos() {
        return numeroPratos;
    }

    public void setNumeroPratos(int numeroPratos) {
        this.numeroPratos = numeroPratos;
    }

    public int getNumerodeTambores() {
        return numerodeTambores;
    }

    public void setNumerodeTambores(int numerodeTambores) {
        this.numerodeTambores = numerodeTambores;
    }

    public void getfichatecnicaDaBateria() {
        System.out.println("Numero de tambores" + getNumerodeTambores());
        System.out.println("Numero de pratos" + getNumeroPratos());
        System.out.println("Cor da bateria" + getCor());
        System.out.println("Tipo de Bateria (Eletronica / Acustica)" + getTipo());
        System.out.println("Material" + getMaterial());
        System.out.println("Numeração da Baqueta");
    }

}
