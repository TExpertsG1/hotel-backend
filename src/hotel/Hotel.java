package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Hospede> hospedes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Quarto> quartos = new ArrayList<>();

    public void cadastrarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void cadastrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }
}
