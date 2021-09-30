package mundo;

public class IntEnxada extends Objeto {
	public static void main(String[] args) {
		Enxada enxada = new Enxada();
		enxada.resistencia = 10;
		enxada.textura = " enxada de ferro";
		System.out.println("Resistencia: " + enxada.resistencia);
		System.out.println("Textura: " + enxada.textura);
		enxada.arar();
		enxada.minerar();
		
		enxada.conquista = false;
		if (enxada.conquista == true) {
			System.out.println("Conquista Desbloqueada. Parabens!!");
			
		} else {
			System.out.println("Voce não desbloqueou a conquista");
		}
	}
}
