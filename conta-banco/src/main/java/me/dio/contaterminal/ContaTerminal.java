package me.dio.contaterminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		String message = "\nOlá [NomeCliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.";

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, insira seu nome: ");
		String nomeCliente = scanner.nextLine();

		System.out.println("Digite o numero da sua agencia: ");
		String agencia = scanner.next();

		System.out.println("Digite o numero da conta bancaria: ");
		int numero = scanner.nextInt();

		System.out.println("Informe o saldo atual de sua conta bancaria: ");
		double saldo = scanner.nextDouble();

		System.out.println(message.replace("[NomeCliente]", nomeCliente).replace("[Agencia]", agencia)
				.replace("[Numero]", String.valueOf(numero)).replace("[Saldo]", String.valueOf(saldo)));

		scanner.close();
	}
}
