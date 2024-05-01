package Entities;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
		} else {
			System.out.println("ERRO: O primeiro número é maior que o segundo");
		}
		
	}

}