/*
 * Programador: Gabriel Lacerda Correia
 * Data: 25/02/2025
 * Empresa: Senai-Jandira
 */

package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	public LocalDate dataNascimento;
	public int peso;
	private double altura;
	public String numeroTelefone;
	private double imc;
	
	public void setAltura(double altura) {
		if(altura > 0) {
			//TRUE
			this.altura = altura;
		} else {
			//FALSE
			System.out.println("A altura do(a) paciente "+ nome +" é invalida!\nA altura precisa ser maior que zero.");
		}
	}
	
	public void setNome(String nome) {
		if(nome.trim().length() >= 3) {
			//TRUE
			this.nome = nome.toUpperCase();
		} else {
			//FALSE
			System.out.println("O nome " + nome + ", não é valido!\nO nome deve conter pelo menos 3 caracteres.");
		}
		
		
	}
	
	public void calcularIdade() {
		
	}
	private double calcularImc() {
		imc = peso/Math.pow(altura, 2);
		return imc;
	}
	public void classificarImc() {
		
	}
	public void mostrarFichaDoPaciente() {
		System.out.println("================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("================");
		System.out.println("NOME: " + nome);
		System.out.println("PESO: " + peso);
		System.out.println("ALTURA: " + altura);
		System.out.println("IMC: " + String.format("%.2f", calcularImc()));
		System.out.println("TELEFONE: " + numeroTelefone);
		System.out.println("================");
	}
	
}
