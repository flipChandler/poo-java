package br.com.felipe.santos.aula01.exemplo02;

public class ProcessoCafeAdocicado extends ProcessoCafe{
	
	public void fazerCafe() {
		super.fazerCafe();// os submetodos de fazerCafe que estão na super-classe (moerGraos e addAgua)
		addAcucar();
	}

	private void addAcucar() {
		System.out.println("adicionando açucar!");
		
	}
	
}
