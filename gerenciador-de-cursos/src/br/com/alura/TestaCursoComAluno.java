package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", 
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando um Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
//		metodo atual
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
//		metodo antes do java 8
//		for (Aluno a: javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
//		metodo antes do java 5
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
//		iterador.hasNext(); //tem mais um objeto para eu pegar? se tiver, nao vou tirar
//		iterador.next(); //ah, tem? entao me devolve o proximo
		while (iterador.hasNext()) { //enquanto esse iterador de Aluno tem um proximo pra ler
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		System.out.println("\nO aluno " + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("\nE esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("\nO a1 é equals ao turini?");
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == turini.hashCode());
	}
}
