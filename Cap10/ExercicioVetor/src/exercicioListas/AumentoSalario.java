package exercicioListas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class AumentoSalario {

	public static void main(String[] args) {
		// Entrar N funcionarios, e selecionar por id qual deverá ter aumento de salario, usando Listas
		//Criando Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered: ");
		int n = sc.nextInt();
		//Criando Listas
		List<Funcionario> list = new ArrayList<>();
		//Criando arrays
		int percent = 0,id;
		String nome;
		float salario = 0;
		Funcionario f1[] = new Funcionario[n];
		// exemplo como construtor no array f1[1] = new Funcionario("12","Lucas", 8000);
		int j = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			id = sc.nextInt();
			System.out.println("Nome:");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Salario: ");
			salario = sc.nextFloat();
			//construtor
			f1[j] = new Funcionario(id,nome,salario);			
			j++;
			
			Funcionario func = new Funcionario(id,nome,salario);
		}

		System.out.println("Enter the employer id that will have salary increase: ");
		id = sc.nextInt();
		System.out.println("Enter the percentage: ");
		percent = sc.nextInt();
		
		for (int i = 0; i < f1.length; i++) {
			if(id == f1[i].getId()) {
			f1[i].aumentarEmDez(id, percent);
			
			}
		}
		
		
		for (Funcionario funcionario : f1) {
			System.out.println(funcionario);
		}
		
		
		
	}

}
