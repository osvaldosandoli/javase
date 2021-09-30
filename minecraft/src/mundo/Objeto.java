package mundo;

public class Objeto {
	int resistencia;
	String textura;

	public Objeto() {
		System.out.println("=====");
	}
/**
 * construir
 */
	void construir() {
		System.out.println("construindo...");
	}
/**
 * minerando
 */
	void minerar() {
		System.out.println("Minerando...");
	}
/**
 * craftando
 */
	void craftar() {
		System.out.println("contruindo item");
	}
}
