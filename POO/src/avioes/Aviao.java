package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
/**
 * aterrzar
 */
	public void aterrizar() {
		System.out.println("Aviao pousou________");
	}
/**
 * acelerar
 */
	public void acelerar() {
		System.out.println("Aviao");
	}
}
