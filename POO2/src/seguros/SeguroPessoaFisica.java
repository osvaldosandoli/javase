/**
 * POO2 - Encapsulamento
 * @author Osvaldo Jose Sandoli Neto
 */

package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		/**
		 * cc3 conta
		 */
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Adriano Walds");
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		cc3.creditar(1000);
		cc3.exibirSaldo();
		cc3.sacar(1500);
		cc3.exibirSaldo();

	}

}
