package hotel;

public class ConversorData {
    public void transfDataIn() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(checkIn);
	}
	public void transfDataOut() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(checkOut);
	}
	
	public int calculoDias() {
		LocalDate dataInicial = LocalDate.parse(setCheckIn(checkIn));
		LocalDate dataFinal = LocalDate.parse(setCheckOut(checkOut));
		int days = (int) ChronoUnit.DAYS.between(dataInicial, dataFinal);
		return days;
	}
}
