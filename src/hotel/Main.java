package hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Quarto quarto1 = new Quarto("Suíte Master", 101, 2, 250.00);
        Quarto quarto2 = new Quarto("Suíte Família", 102, 4, 350.00);
        Quarto quarto3 = new Quarto("Suíte Premium", 103, 6, 450.00);

        hotel.cadastrarQuarto(quarto1);
        hotel.cadastrarQuarto(quarto2);
        hotel.cadastrarQuarto(quarto3);

        for (Quarto quarto : hotel.getQuartos()) {
            Quarto.imprimirQuarto(quarto);
        }

        Hospede hospede1 = new Hospede("Maria Eduarda", 26, "MariaEduarda@email.com", 12345678);
        Hospede hospede2 = new Hospede("João Silva", 34, "JoãoSilva@email.com", 12121212);
        Hospede hospede3 = new Hospede("Fernando Lima", 29, "FernandoLima@email.com", 98765432);

        hotel.cadastrarHospede(hospede1);
        hotel.cadastrarHospede(hospede2);
        hotel.cadastrarHospede(hospede3);

        for (Hospede hospede : hotel.getHospedes()) {
            Hospede.imprimirHospede(hospede);
        }

        Reserva reserva1 = new Reserva(hospede1, quarto1, LocalDate.now(), LocalDate.now().plusDays(3), 1, 0);
        Reserva reserva2 = new Reserva(hospede2, quarto2, LocalDate.now(), LocalDate.now().plusDays(5), 2, 2);
        Reserva reserva3 = new Reserva(hospede3, quarto3, LocalDate.now(), LocalDate.now().plusDays(7), 6, 0);

        hotel.cadastrarReserva(reserva1);
        hotel.cadastrarReserva(reserva2);
        hotel.cadastrarReserva(reserva3);

        CalcularPreco calcular = new CalcularPreco();
        for (Reserva reserva : hotel.getReservas()) {
           System.out.println(reserva.toString() + " Valor Total: R$ " + CalcularPreco.precoReserva(reserva)); 
        }
        System.out.println("-------------");

        Funcionario recepcionista1 = new Funcionario("Michelle", 38, "Michelle@email.com", Cargos.RECEPCIONISTA);
        Funcionario recepcionista2 = new Funcionario("Bruno", 27, "Bruno@email.com", Cargos.AUXILIAR_RECEPCAO);
        Funcionario gerente = new Funcionario("André Luiz", 32, "AndreLuiz@gmail.com", Cargos.CAMAREIRA);
        Funcionario cozinheiro1 = new Funcionario("André Barbosa", 40, "AndreBarbosa@email.com", Cargos.GERENTE);
        Funcionario cozinheiro2 = new Funcionario("Arthur", 23, "Arthur@email.com", Cargos.RECEPCIONISTA);
        Funcionario zelador1 = new Funcionario("Angela", 28, "Angela@email.com", Cargos.AUXILIAR_RECEPCAO);
        Funcionario zelador2 = new Funcionario("Zenilson", 30, "Zenilson@email.com", Cargos.CAMAREIRA);

        hotel.cadastrarFuncionario(recepcionista1);
        hotel.cadastrarFuncionario(recepcionista2);
        hotel.cadastrarFuncionario(gerente);
        hotel.cadastrarFuncionario(cozinheiro1);
        hotel.cadastrarFuncionario(cozinheiro2);
        hotel.cadastrarFuncionario(zelador1);
        hotel.cadastrarFuncionario(zelador2);

        for (Funcionario funcionario : hotel.getFuncionarios()) {
            Funcionario.imprimirFuncionario(funcionario);
        }
    }
}
