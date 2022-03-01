package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 * Description: Faça um programa que calcule a área de um quadrado em seguida mostre o dobro desta área para o usuário.
 */
public class Exe07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informa um valor: ");
		double valor = sc.nextDouble();
		double area = valor * valor;
		
		System.out.println("O dobro da área é " + area * 2);
		
		sc.close();
	}

}
