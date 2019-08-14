package Enterprise;

public class Funcionario {
private String nome;
private double sal;
private int id;

Funcionario (String nome, double sal, int id){
	this.nome=nome;
	this.sal=sal;
	this.id=id;
}

public String getNome() {
	return nome;
}


public double getSal() {
	return sal;
}


public int getId() {
	return id;
}

public void ajuste(double taxa) {
	sal=sal+(taxa*sal/100);
}


}
