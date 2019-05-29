package br.com.senac.poo;

public class Cessna {

	public static void main(String[] args) {
		Aviao c182 = new Aviao();
		c182.ano = 2015;
		c182.cor = "Branco";
		c182.envergadura = 11;
		System.out.println("Cessna c182");
		System.out.println("Ano: " + c182.ano);
		System.out.println("Cor: " + c182.cor);
		System.out.println("Envergadura: " + c182.envergadura);
		c182.aterrissar();
	}
}
