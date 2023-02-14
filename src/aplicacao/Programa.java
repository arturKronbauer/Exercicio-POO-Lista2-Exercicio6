package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Haverá um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nomeTitular, depositoInicial);
		}
		else {
			conta = new Conta(numero, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe um valor de Depósito: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe um valor de saque: ");
		valor = sc.nextDouble();
		conta.retirada(valor);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		sc.close();
	}
}
