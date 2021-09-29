package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		/**
		 * aviao
		 */
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2023;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = false;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: + boeing777.ano");
		System.out.println("Ano: + boeing777.cor");
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		} else {
			System.out.println("ARREMETER");
		}
	}
}
