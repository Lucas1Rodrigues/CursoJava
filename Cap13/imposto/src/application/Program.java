package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import imposto.Contribuinte;
import imposto.PessoaFisica;
import imposto.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		List<Contribuinte> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.println("Individual or company (i/c): ");
			char c = sc.next().charAt(0);
			if(c == 'i' ) {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.println("Health expenditures: ");
				Double gastosComSaude = sc.nextDouble();
				PessoaFisica pf1 = new PessoaFisica(name, rendaAnual, gastosComSaude);
				list.add(pf1);
			}else{
				System.out.println("Company name: ");
				String name = sc.next();
				System.out.println("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.println("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				PessoaJuridica pj1 = new PessoaJuridica(name, rendaAnual, numeroFuncionarios);
				list.add(pj1);
			}
		}
		Double totalTaxes = 0.0;
		System.out.println("TAXES PAID: ");
		for (Contribuinte c : list) {
			totalTaxes += c.calculoImposto();
			System.out.println(c.toString());
		}
		
		System.out.print("\nTOTAL TAXES PAID: ");
		System.out.println(totalTaxes);
	}

}
