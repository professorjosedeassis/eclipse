/**
 * Criando um objeto
 */
package br.com.senac.poo;

public class Fusca {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de nome fusquinha
		// tendo como modelo a classe carro
		Carro fusquinha = new Carro();
		// a linha abaixo atribui o valor 1967 a variável ano
		// tipos de variáveis inteiros não usam "" 
		fusquinha.ano = 1967;
		// a linha abaixo atribui a cor azul a variável cor
		// Variável do tipo String usa ""
		fusquinha.cor = "azul";
		System.out.println("Carro: fusca");
		// a linha abaixo "junta" concatena um texto com o 
		// conteúdo da variável ano
		System.out.println("Ano: " + fusquinha.ano);
		System.out.println("Cor: " + fusquinha.cor);
		// a linha abaixo executa o método acelerar
		fusquinha.acelerar();
	}

}
