/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
package PacoteJava;

import java.util.Scanner;

public class programacaoSequencial2 {

	public static void main(String[] args) {
		int duracao,hora,minuto,segundo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("insira a dura��o do evento em segundos: ");
		duracao = leia.nextInt();
		
		hora=duracao/3600;
		minuto=duracao%3600/60;
		segundo=(duracao%3600)%60;
		
		System.out.println("A dura��o do evento foi de: "+hora+"hora(s) "+minuto+"minuto(s) e "+segundo+"segundos");
	}

}
