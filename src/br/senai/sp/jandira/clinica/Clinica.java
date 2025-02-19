package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// Criando um objeto paciente
		
		Paciente p1 = new Paciente();
		p1.nome = "Joanna";
		p1.altura = 1.64;
		p1.peso = 59;
		p1.numeroTelefone = "11 94449 2067";
		p1.dataNascimento = LocalDate.of(2007, 7, 3);
		
		Paciente p2 = new Paciente();
		p2.nome = "Gabriel";
		p2.altura = 1.74;
		p2.peso = 78;
		p2.numeroTelefone = "11 94449 2067";
		p2.dataNascimento = LocalDate.of(2005, 5, 10);
		
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
		
	}
}
