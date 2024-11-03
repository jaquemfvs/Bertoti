package model;

public class Reserva {
    private String nomeCliente;
    private Mesa mesa;
    private String horario;

    public Reserva(String nomeCliente, Mesa mesa, String horario) {
        this.nomeCliente = nomeCliente;
        this.mesa = mesa;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Reserva para " + nomeCliente + " na " + mesa + " às " + horario;
    }
}