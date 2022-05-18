package listajava01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava01_04 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 04. A Loja Mam�o com A�ucar est� vendendo seus produtos em 5 (cinco) presta��es sem juros.
 * Fa�a um algoritmo que receba um valor de uma compra e mostre o valor das presta��es. */
	
	DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
	
	System.out.println("Qual o valor total da sua compra: ");
	double totalcompra = teclado.nextDouble();
	
	System.out.println("Informe em quantas vezes (quantidade de parcelas) deseja dividir o valor de sua compra: ");
	int parcelas = teclado.nextInt();
	
	double valorparcelas = totalcompra / parcelas;
	
	System.out.println("Sua compra, no valor de " + reais.format(totalcompra) + ", ser� dividida em " + parcelas + " parcelas de " + reais.format(valorparcelas) );

teclado.close();

	}

}
