package hotel;

import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDate dataCheckin;
    private LocalDate dataCheckout;
    private int quantidadeAdulto;
    private int quantidadeCrianca;

    public Reserva(Hospede hospede, Quarto quarto, LocalDate dataCheckin, LocalDate dataCheckout, int quantidadeAdulto,
            int quantidadeCrianca) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.quantidadeAdulto = quantidadeAdulto;
        this.quantidadeCrianca = quantidadeCrianca;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataCheckin() {
        return dataCheckin;
    }

    public LocalDate getDataCheckout() {
        return dataCheckout;
    }

    public int getQuantidadeAdulto() {
        return quantidadeAdulto;
    }

    public void setQuantidadeAdulto(int quantidadeAdulto) {
        this.quantidadeAdulto = quantidadeAdulto;
    }

    public int getQuantidadeCrianca() {
        return quantidadeCrianca;
    }

    public void setQuantidadeCrianca(int quantidadeCrianca) {
        this.quantidadeCrianca = quantidadeCrianca;
    }

    @Override
    public String toString() {
        return "Reservas: Quarto nº: " + getQuarto().getNumero() + ", Data CheckIn: " + dataCheckin
                + ", Data Checkout: "
                + dataCheckout + ", Adultos: " + quantidadeAdulto + ", Crianças: " + quantidadeCrianca;
    }
}