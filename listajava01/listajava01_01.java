package listajava01;

import java.util.Scanner;

public class listajava01_01 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 01. Fa�a um algoritmo que receba dois n�meros e ao final mostre a adi��o, subtra��o, multiplica��o e divis�o dos numeros lidos. */
		
	System.out.println("Informe o primeiro n�mero: ");
	float n1 = teclado.nextFloat();
	System.out.println("Informe o segundo n�mero: ");
	float n2 = teclado.nextFloat();
	
	float adicao = n1 + n2;
	float subtracao = n1 - n2;
	float multiplicacao = n1 * n2;
	float divisao = n1 / n2;
	
	System.out.println(n1 + " + " + n2 + " = " + adicao);
	System.out.println(n1 + " - " + n2 + " = " + subtracao);
	System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
	System.out.println(n1 + " / " + n2 + " = " + divisao);
		
teclado.close();

	}

}
