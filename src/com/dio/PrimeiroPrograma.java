package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Livros livro = new Livros();
		Gato gato = new Gato();
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livros {
	private String nome;
	private String npag;
}
