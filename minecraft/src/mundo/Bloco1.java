package mundo;

public class Bloco1 {

	public static void main(String[] args) {
		Objeto blocoEsmeralda = new Objeto();
		blocoEsmeralda.resistencia = 4;
		blocoEsmeralda.textura = "Esmeralda";
		System.out.println("Bloco: " + blocoEsmeralda.textura);
		System.out.println("Resistência: " + blocoEsmeralda.resistencia);
		blocoEsmeralda.minerar();
		blocoEsmeralda.craftar();

		Objeto blocoObisidian = new Objeto();
		blocoObisidian.resistencia = 10;
		blocoObisidian.textura = "Obsidian";
		System.out.println("Bloco: " + blocoObisidian.textura);
		System.out.println("Resistência: " + blocoObisidian.resistencia);
		blocoEsmeralda.minerar();
		blocoEsmeralda.craftar();
	}
}
