package listajava01;

import java.util.Scanner;

public class listajava01_03 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Professor: Junio Figueiredo
//Aluna: J�ssica Raissa
		
Scanner teclado = new Scanner (System.in);
				
/* 03. Fa�a um programa que pe�a a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit. 
 * F = (C * 9/5) + 32 */
		
	System.out.println("Informe a temperatura em graus Celsius (�C): ");
	float tc = teclado.nextFloat();
	
	float tf = (tc * 9/5f) + 32;
	
	System.out.println(tc + "�C equivale a " + tf + "�F.");

teclado.close();

	}

}
