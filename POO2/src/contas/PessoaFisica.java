package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		/**
		 * cc1 conta
		 */
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("cliente:" + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.creditar(2000);
		cc1.exibirSaldo();
		System.out.println("-----------------");

		
	
	/**
	 * cc2 conta
	 */
	Conta cc2 = new Conta();
	cc2.setCliente("Viviane Andrade");
	cc2.setSaldo(2000);
	System.out.println("cliente:" + cc2.getCliente());
	cc2.exibirSaldo();
	cc2.sacar(200);
	cc2.exibirSaldo();
	
	System.out.println("--------------------");
	System.out.println("Favorecido: " + cc2.getCliente());
	cc2.exibirSaldo();
	cc1.transferir(cc2, 1200);
	System.out.println("--------------------");
	System.out.println("Cliente: " + cc1.getCliente());
	cc1.exibirSaldo();
	System.out.println("Favorecido: " + cc2.getCliente());
	cc2.exibirSaldo();
	
	System.out.println("-----------------");
	
	
	int i = 10;
	System.out.println(i);
	i+= 5;
	System.out.println(i);
	i-= 5;
	System.out.println(i);
	System.out.println("i");
	
	}
	
	
}
