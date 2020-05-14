package br.com.felipe.santos.aula01.exemplo02;

// RELACAO É-UM  |  FISCAL É UMA PESSOA
public class Fiscal extends Pessoa{

	// RELACAO USA ENTRE FISCAL E CASA
	public void vistoriar(Casa casa) {
		System.out.println("O fiscal está analisando a casa...");
	}
}
