package br.com.senac.poo;

public class Camaro {

	public static void main(String[] args) {
		Carro bumblebee = new Carro();
		bumblebee.ano = 1986;
		bumblebee.cor = "preto";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + bumblebee.ano);
		System.out.println("Cor: " + bumblebee.cor);
		bumblebee.acelerar();
		bumblebee.transformar();
	}

}
