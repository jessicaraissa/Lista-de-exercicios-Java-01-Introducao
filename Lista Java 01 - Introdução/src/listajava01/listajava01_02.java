package listajava01;

import java.util.Scanner;

public class listajava01_02 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Professor: Junio Figueiredo
//Aluna: J�ssica Raissa
		
Scanner teclado = new Scanner (System.in);
				
/* 03. Fa�a um programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre em graus Celsius.
 * C = (F - 32) * 5/9  */
		
	System.out.println("Informe a temperatura em graus Farenheit (�F): ");
	float tf = teclado.nextFloat();
	
	float tc = ( tf - 32f ) * 5/9f ;
	
	System.out.println(tf + "�F equivale a " + tc + "�C.");

teclado.close();

	}

}
