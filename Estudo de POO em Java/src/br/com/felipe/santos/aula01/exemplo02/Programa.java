package br.com.felipe.santos.aula01.exemplo02;

public class Programa {
	public static void main(String[] args) {
		Pessoa fiscal = new Fiscal();
		fiscal.setNome("John");
		
		System.out.println(fiscal.getNome());
		
		System.out.println();
		
		ProcessoCafe cafeAdocicado = new ProcessoCafeAdocicado();
		
		System.out.println("---------------------");
		
		cafeAdocicado.fazerCafe();
	}
}
