package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		//FOREACH = para cada String aula dentro de aulas faça
		for (String aula: aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeirAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeirAula);
		
		//no lugar de length(), em uma coleções utilizamos o método size()
		for (int i = 0; i <aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		System.out.println(aulas.size());
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando o nosso conhecimento");
		System.out.println("Antes de ordenado: " + aulas);
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: " + aulas);
	}
}
