package modelo;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Empresa;

public class DemoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp = 0,valor=0;
		Scanner scan = new Scanner(System.in);
		ArrayList <Empresa> empresas = new ArrayList<Empresa>();
		Empresa n;
		
		do {
			n=new Empresa();
			System.out.println("Digite o nome da Empresa: ");
			n.setNome(scan.nextLine());
			
			System.out.println("Digite o cnpj da Empresa: ");
			n.setCnpj(scan.nextLine());
			
			System.out.println("Digite o endereço da Empresa: ");
			n.setEndereco(scan.nextLine());
			
			System.out.println("Digite a cidade da Empresa: ");
			n.setCidade(scan.nextLine());;
			
			System.out.println("Digite o Estado da Empresa: ");
			n.setEstado(scan.nextLine());
			
			System.out.println("Digite o telefone da Empresa: ");
			n.setTelefone(scan.nextLine());
			
			System.out.println("Digite a quantidade de funcionários da Empresa: ");
			n.setQtdFunc(scan.nextInt());
			scan.nextLine();
			
			empresas.add(n);
			
			System.out.println("Deseja continuar cadastrando?\n1- Sim;\n2- Não;");
			resp = scan.nextInt();
			scan.nextLine();
		}
		
		while(resp == 1 && empresas.size() < 50);
		
		for(int i=0; i<empresas.size(); i++) {
			System.out.println(empresas.get(i).toString());
		}
		
		//Descobrindo o maior valor para quantidade de funcionários.
		for(int i=0; i<empresas.size(); i++) {
			if(empresas.get(i).getQtdFunc() > valor) {
				valor = empresas.get(i).getQtdFunc();
			}
		}
		
		//Percorrendo a lista de novo para saber se possuem mais de uma empresa com a mesma quantidade de funcionários.
		for(int i=0; i<empresas.size(); i++) {
			if(empresas.get(i).getQtdFunc() == valor) {
				System.out.println("\nEmpresa(s) com mais funcionários: \n");
				System.out.println(empresas.get(i).toString());
			}
		}
		
	}

}