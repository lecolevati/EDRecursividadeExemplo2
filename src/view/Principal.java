package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pot = new PotenciaController();
		int base = 3;
		int expoente = 5;
		int resultado = pot.potencia(base, expoente);
		System.out.println(resultado);
	}
}
