package br.com.desafioAcimaDaDiagonalSecundaria;

import java.util.Scanner;

public class Main {
	//Enunciado: Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
	//Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal secundária da matriz.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double soma= 0;
		
		System.out.println("Indique a operação desejada, Soma ou Média('S'/'M'): " );
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
