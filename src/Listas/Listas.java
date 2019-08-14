package Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Maria");
		list.add("Joao");
		list.add(1,"Marcos");
		list.remove(0);
		
		for(String x:list) {
			System.out.println(x);
		}
	}

}
