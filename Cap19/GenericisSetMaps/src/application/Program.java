package application;

import generics.MinhaClasee;

public class Program {

	public static void main(String[] args) {
		MinhaClasee<Integer> inteiro = new MinhaClasee<>(2);
		MinhaClasee<Double>  real = new MinhaClasee<>(1.2);
		
		
		
		System.out.println(real.aoQuadrado(real));
		System.out.println(inteiro.aoQuadrado(inteiro));
		
		
	}

}
