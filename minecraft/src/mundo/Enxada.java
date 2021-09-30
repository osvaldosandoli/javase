package mundo;

public class Enxada extends Objeto {
	boolean conquista;

	

	public void arar() {
		System.out.println("Vamos arar?");
		conquista = true;
	}
	
	
	public void minerar() {
		System.out.println("Vamos minerar?");
		conquista = false;
}
}