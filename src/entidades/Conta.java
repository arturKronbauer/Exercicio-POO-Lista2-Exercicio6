package entidades;

public class Conta {
	private int numero;
	private String nomeTitular;
	private double saldo;

	public Conta(int numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numero, String nomeTitular, double depositoInicial) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void retirada(double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "Conta " + numero+ ", Nome do Titular: " + nomeTitular + ", Saldo: R$ " + String.format("%.2f", saldo);
	}
}
