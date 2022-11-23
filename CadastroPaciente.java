package modelo;
import java.util.Scanner;

import modelo.paciente;

public class CadastroPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String nome,tel,cpf;
		int cod;
		
		paciente[] paciente;
		paciente = new paciente[3];
		
	for(int i=0; i<3; i++) {
		paciente[i] = new paciente();
	}
	
	for(int i=0; i<3; i++) {
		
		System.out.println("Insira Nome: ");
		nome = scan.nextLine();
		paciente[i].setNome(nome); 
		
		System.out.println("Insira Telefone: ");
		tel= scan.nextLine();
		paciente[i].setTel(tel);
		
		System.out.println("Insira CPF: ");
		cpf = scan.nextLine();
		paciente[i].setCpf(cpf);
		
		System.out.println("Insira o codigo: ");
		cod= scan.nextInt();
		paciente[i].setCodigo(cod);
		
		
		scan.nextLine();
		

		
	}
	for(int i=0; i<paciente.length; i++) {
		paciente[i].toString();
	System.out.println(paciente[i].toString());
	}
	
	
}
}
