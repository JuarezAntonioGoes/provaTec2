package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.controller.Conta;
import br.edu.univas.controller.VerSaldo;
import br.edu.univas.model.ContaModel;

public class StartApp {

	public static void main(String[] args) {
		ContaModel count [] = new ContaModel[100];
		
		boolean exit = false;
		do {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Cadastro de Conta");
			System.out.println("1 – Cadastro de Conta");
			System.out.println("2 – Ver Saldo");
			System.out.println("3 - Sair");

			int option = input.nextInt();

			switch (option) {
			case 1:
				new Conta(count);
				break;
			case 2:
				new VerSaldo(count);	
				break;
			case 3:
				exit = true;
				break;
			default:
				break;
			}
		} while (!exit);
	}

}