package Teste;

import java.util.Locale;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		int v[]= new int[10];
		int i;
		System.out.printf("Quantas pessoas vão alugar o quarto?\n");
		int qtd=sc.nextInt();
		sc.nextLine();
		String name[]= new String[qtd];
		String email[]= new String[qtd];
		for(i=0;i<qtd;i++) {
			System.out.printf("Qual o nome da pessoa %d?\n", i+1);
			name[i]=sc.nextLine();
			System.out.printf("Qual o email da pessoa %d?\n", i+1);
			email[i]=sc.nextLine();
			System.out.printf("Qual o quarto da pessoa %d?\n", i+1);
			v[i]=sc.nextInt();
			sc.nextLine();
		}
			
			for(i=0;i<qtd;i++) {
				System.out.printf("%d: %s, %s\n", v[i], name[i], email[i]);
			}
			sc.close();
		}

	}


