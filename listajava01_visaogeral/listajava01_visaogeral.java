package listajava01_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava01_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exerc�cios de Java 01 - Introdu��o / B�sico
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


	/* 01. Fa�a um algoritmo que receba dois n�meros e ao final mostre a adi��o, subtra��o, multiplica��o e divis�o dos numeros lidos.
				
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
		
		
		
		
	/* 02. Fa�a um programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre em graus Celsius.
	* C = (F - 32) * 5/9
				
		System.out.println("Informe a temperatura em graus Farenheit (�F): ");
		float tf = teclado.nextFloat();
			
		float tc = ( tf - 32f ) * 5/9f ;
			
		System.out.println(tf + "�F equivale a " + tc + "�C.");
		
		
		
		
	/* 03. Fa�a um programa que pe�a a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit. 
	* F = (C * 9/5) + 32
				
		System.out.println("Informe a temperatura em graus Celsius (�C): ");
		float tc = teclado.nextFloat();
			
		float tf = (tc * 9/5f) + 32;
			
		System.out.println(tc + "�C equivale a " + tf + "�F.");
		
		
		
		
	/* 04. A Loja Mam�o com A�ucar est� vendendo seus produtos em 5 (cinco) presta��es sem juros.
	* Fa�a um algoritmo que receba um valor de uma compra e mostre o valor das presta��es.
			
		DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
			
		System.out.println("Qual o valor total da sua compra: ");
		double totalcompra = teclado.nextDouble();
			
		System.out.println("Informe em quantas vezes (quantidade de parcelas) deseja dividir o valor de sua compra: ");
		int parcelas = teclado.nextInt();
			
		double valorparcelas = totalcompra / parcelas;
			
		System.out.println("Sua compra, no valor de " + reais.format(totalcompra) + ", ser� dividida em " + parcelas + " parcelas de " + reais.format(valorparcelas) );

		
		
		
	/* 05. A padaria da FPB vende certa quantidade de p�es franceses e certa quantidade de broas a cada dia.
	* Cada p�ozinho custa R$0.12 e cada broa custa R$1.50.
	* Ao final do dia, o dono quer saber o quanto arrecadou com as vendas de p�es e broas.
	* Ele deve, tamb�m, guardar 10% do que arrecadou na poupan�a.
	* Desenvolva um programa para informar ao dono o valor arrecadado e o valor a ser depositado na poupan�a.
			
		DecimalFormat reais = new DecimalFormat ("R$ ##0.00");
			
		System.out.println("Quantos p�ezinhos foram vendidos hoje?");
		int qtddpaes = teclado.nextInt();
			
		System.out.println("Quantas broas foram vendidas hoje?");
		int qtddbroas = teclado.nextInt();
			
		double valorpaes = qtddpaes * 0.12;
		double valorbroas = qtddbroas * 1.50;
			
		double arrecadado = valorpaes + valorbroas;
			
		double poupanca = arrecadado * 0.1;
			
		System.out.println("O valor total arrecadado hoje foi: " + reais.format(arrecadado));
		System.out.println("O valor a ser depositado na poupan�a hoje �: " + reais.format(poupanca));
		
		
		
		
	/* 06. Tr�s amigos (Jo�o, Carlos e Paulo), decidiram rachar igualmente uma conta de um bar.
	* Fa�a um programa para ler o valor total da conta e imprimir quanto cada um deve pagar.
	* Jo�o e Carlos n�o devem pagar os centavos.
	* Ex: Valor da conta R$9,70; Jo�o e Carlos pagam R$3,00, cada; Paulo paga R$3,70.
	* Utilizar a classe a seguir:
	* DecimalFormat df = new DecimalFormat("##0.00");
	* df.format();
			
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
		
		
		
*/		
teclado.close();		

	}

}
