package hotel;

import java.time.temporal.ChronoUnit;

public class CalcularPreco {
    public static double precoReserva(Reserva reserva) {
        double valorDiaria = reserva.getQuarto().getDiaria();
        int quantidadeDias = (int) ChronoUnit.DAYS.between(reserva.getDataCheckin(), reserva.getDataCheckout()) + 1;
        double valorTotal = valorDiaria * quantidadeDias;
        return valorTotal;
    }
}