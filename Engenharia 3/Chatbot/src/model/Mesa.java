package model;

public class Mesa {
    private int numero;
    private int capacidade;

    public Mesa(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + " (Capacidade: " + capacidade + ")";
    }
}