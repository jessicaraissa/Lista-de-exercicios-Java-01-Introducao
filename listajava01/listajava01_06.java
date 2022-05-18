package listajava01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava01_06 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 06. Tr�s amigos (Jo�o, Carlos e Paulo), decidiram rachar igualmente uma conta de um bar.
 * Fa�a um programa para ler o valor total da conta e imprimir quanto cada um deve pagar.
 * Jo�o e Carlos n�o devem pagar os centavos.
 * Ex: Valor da conta R$9,70; Jo�o e Carlos pagam R$3,00, cada; Paulo paga R$3,70.
 * Utilizar a classe a seguir:
 * DecimalFormat df = new DecimalFormat("##0.00");
 * df.format();*/
	
	DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
	
	System.out.println("Qual o valor total da conta?");
	double conta = teclado.nextDouble();
	
	
	//forma 1:
	
	double divisao = conta / 3;
	
	double joao = (int) divisao;
	double carlos = joao;
	double paulo = conta - (joao + carlos);
	
	System.out.println("O valor total da conta �: " + reais.format(conta));
	System.out.println("Jo�o dever� pagar: " + reais.format(joao));
	System.out.println("Carlos dever� pagar: " + reais.format(carlos));
	System.out.println("Paulo dever� pagar: " + reais.format(paulo));
	
	
	//forma 2:
	
	int intconta = (int) conta;
	int intterco = intconta / 3;
	double comcentavos = conta - (2 * intterco);
	
	System.out.println("O valor total da conta �: " + reais.format(conta));
	System.out.println("Jo�o dever� pagar: " + reais.format(intterco));
	System.out.println("Carlos dever� pagar: " + reais.format(intterco));
	System.out.println("Paulo dever� pagar: " + reais.format(comcentavos));
	
teclado.close();

	}

}
