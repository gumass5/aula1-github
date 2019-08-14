package Enterprise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite a quantidade de funcionários: ");
		int qtd=scan.nextInt();
		scan.nextLine();
		
		List<Funcionario> list= new ArrayList<>();

		
		for(int i=0;i<qtd;i++) {
			System.out.println("Digite o nome: ");
			String nome=scan.nextLine();
			System.out.println("Digite o salario: ");
		    double sal=scan.nextDouble();
			System.out.println("Digite o id: ");
			int id=scan.nextInt();
			scan.nextLine();
			list.add(new Funcionario (nome,sal,id));
		}

		System.out.println("Digite um ID para procurar: ");
		int idproc=scan.nextInt();
		
		
		Funcionario func=list.stream().filter(x -> x.getId()==idproc).findFirst().orElse(null);
		if(func==null) {
			System.out.println("O empregado não existe");
		} else {
			System.out.println("Qual o aumento em % do funcioniario? ");
			int aumento=scan.nextInt();
			func.ajuste(aumento);
		}
		
		System.out.println();
		
		for(Funcionario obj: list) {
			System.out.println(obj);
		}
		


		
		
		scan.close();
	}

}
