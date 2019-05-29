/**
 * 
 */
package br.com.senac.poo2;

/**
 * @author jose.afilho3
 * POO2 - Construtores e métodos com retorno
 */
public class Carro {
	int ano;
	String cor;
	double velocidade = 170;
	//construtores são blocos  de comando que podem ser usados para inicializar objetos
	//construtores precisam ter o mesmo nome da classe principal
	public Carro(int ano, String cor){
		this.ano = ano;
		this.cor = cor;
	}
	//método com retorno (não usa void)
	//o retorno é a variável velocidade, portanto devemos criar o método com o tipo da variável (no exemplo double)
	public double acelerar(){
		return velocidade;
	}
}
