package teoriaDataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {

	public static void main(String[] args) {
		LocalTime horas = LocalTime.now();
		DateTimeFormatter fhora = DateTimeFormatter.ofPattern("HH:mm");
		String horasFormatado = horas.format(fhora);
		
		LocalDate dia = LocalDate.now();
		DateTimeFormatter fdia = DateTimeFormatter.ofPattern("dd/MM");
		String dataHoje = dia.format(fdia);
		
		System.out.println("Pedro pergunta: -Olá, Lucas.");
		System.out.println("Lucas Responde: -Olá Pedro.");
		
		System.out.println("Voce sabe que horas são?");
		System.out.println("As horas... São exatamente " + horasFormatado);
		
		System.out.println("Oloco, Ja esta acabando o expediente!\n Que dia é hoje mesmo do mês?");
		System.out.println("Deixa eu ver... Hoje é dia " + dataHoje);
	}
}
