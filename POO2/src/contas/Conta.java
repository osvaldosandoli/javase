package contas;

public class Conta {
	private double saldo;
	private String cliente;

	/**
	 * obter o saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor a variavel saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * obter o nome do cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a variavel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agência 0261");
	}

	/**
	 * exibir o saldo da conta
	 */

	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	/**
	 * debitar um valor na conta corrente
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
	}

	/*
	 * creditar um valor na conta
	 */
	protected void creditar(double valor) {
		saldo += valor;
		System.out.println("Credito: " + valor);
	}

	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.creditar(valor);
		System.out.println("Transferência: R$ " + valor);
	}

}
