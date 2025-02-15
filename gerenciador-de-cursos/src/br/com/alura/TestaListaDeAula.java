package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayList", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);//ira exibir todas as referencias que estao dentro da ArrayList
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//irá ordenar as aulas comparando o tempo das aulas
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		//OU
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
	}
}
