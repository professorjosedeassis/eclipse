package br.com.senac.poo2;

public class Fiat {

	public static void main(String[] args) {
		//este objeto usa o construtor como "template", e neste caso devemos atribuir valores ao ao objeto (int, String)
		Carro uno = new Carro(2003,"Azul");
		System.out.println("Fiat UNO");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		System.out.println("Velocidade máxima: " + uno.acelerar());

	}

}
