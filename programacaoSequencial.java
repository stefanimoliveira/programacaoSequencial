/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */
package PacoteJava;

import java.util.Scanner;

public class programacaoSequencial {

	public static void main(String[] args) {
		int idade,ano,mes,dia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade(em dias): ");
		idade = leia.nextInt();
		
		ano=idade/365;
		mes=(idade%365)/30;
		dia=(idade%365)%30;
		
		System.out.println("A sua idade é: "+ano+ "ano(s),"+mes+ "mês(es), "+dia+ "dia(s)");
		
				
		
		
		

	}

}
