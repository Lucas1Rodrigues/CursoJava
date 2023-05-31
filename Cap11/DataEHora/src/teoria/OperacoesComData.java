package teoria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OperacoesComData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LocalDate x0 = LocalDate.parse("2023-05-28");
		System.out.println(x0);
		
		//Operaçoes menos
		LocalDate lastWeek = x0.minusDays(7);
		System.out.println("Semana passada: " + lastWeek);
		//soma
		LocalDate nextWeek = x0.plus(7, ChronoUnit.YEARS);
		System.out.println("Proxima Semana: " + nextWeek);
	}

}
