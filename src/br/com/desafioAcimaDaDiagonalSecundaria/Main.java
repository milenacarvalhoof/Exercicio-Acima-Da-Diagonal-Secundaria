package br.com.desafioAcimaDaDiagonalSecundaria;

import java.util.Scanner;

public class Main {
	//Enunciado: Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e uma matriz M[12][12]. 
	//Em seguida, calcule e mostre a soma ou a m�dia considerando somente aqueles elementos que est�o acima da diagonal secund�ria da matriz.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double soma= 0;
		
		System.out.println("Indique a opera��o desejada, Soma ou M�dia('S'/'M'): " );
		String op = ler.nextLine();
		
		Double matriz[][] = new Double[4][4];
		
		int n = matriz.length - 1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ler.nextDouble();
			}
		}
		
		for (int i = 0; i < matriz.length - 1; i++) {
			for (int j = 0; j < n; j++) {
				soma += matriz[i][j]; 
			}
			n--;
		}
		
		if (op.equalsIgnoreCase("S")) {
			System.out.println(soma);
		} else if (op.equalsIgnoreCase("M")) {
			double media = soma / matriz.length;
			System.out.println(media);
		}

		ler.close();		
	}

}
