package controller;

public class PotenciaController {

	public PotenciaController() {
		super();
	}

	
	public int potencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * potencia(base, expoente - 1);
		}
	}
}
