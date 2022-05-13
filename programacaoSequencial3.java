/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */
package PacoteJava;

import java.util.Scanner;

public class programacaoSequencial3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		float mediaPonderada;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("insira a primeira nota: ");
		n1 = leia.nextInt();
		System.out.println("insira a segunda nota: ");
		n2 = leia.nextInt();
		System.out.println("insira a terceira nota: ");
		n3 = leia.nextInt();
		
		mediaPonderada=(n1*2+n2*3+n3*5)/10;
		
		System.out.println("A mádia do aluno é: "+mediaPonderada);
	}

}
