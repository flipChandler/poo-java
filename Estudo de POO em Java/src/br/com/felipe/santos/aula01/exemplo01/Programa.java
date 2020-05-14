package br.com.felipe.santos.aula01.exemplo01;

public class Programa {

	public static void main(String[] args) {
		Caixa caixa = new Caixa(30, 20, 60);
		
		System.out.println("A altura da caixa é " + caixa.getAltura());
		System.out.println("O comprimento da caixa é " + caixa.getComprimento());
		System.out.println("A largura da caixa é " + caixa.getLargura());
	}

}
