package br.com.fiapride.model;
public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    // Construtor
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0); // Todo mundo começa com zero
    }

    // Método para adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }

        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Recarga realizada. Novo saldo: " + this.getSaldo());
    }

    // Método para pagar viagem
    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }

        if (this.getSaldo() < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }

        this.setSaldo(this.getSaldo() - custo);
        System.out.println("Viagem paga. Saldo restante: " + this.getSaldo());
    }

    // GET SALDO
    public double getSaldo() {
        return this.saldo;
    }

    // SET SALDO
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // GET NOME
    public String getNome() {
        return this.nome;
    }

    // SET NOME
    private void setNome(String nome) {
        this.nome = nome;
    }

    // GET CPF
    public String getCpf() {
        return this.cpf;
    }

    // SET CPF
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}