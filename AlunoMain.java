package pacote;

import java.util.ArrayList;
import java.util.Scanner;

import pacote.Aluno;

public class AlunoMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check, i=0;
		double soma=0;
		String nome;
		Scanner scan = new Scanner(System.in);
		ArrayList <Aluno> alunosList = new ArrayList <Aluno>();
		
		Aluno[] alunos;
		alunos = new Aluno[500];
		
		System.out.println("\n1- Cadastrar um aluno;"+ "\n2- Buscar um aluno pelo nome;"+ "\n3- Exibir a lista de alunos;"+ "\n4- Calcular a média da turma;"+ "\n5- Sair;");
		check = scan.nextInt();
		
		while(check > 0 && check < 5) {
			
			if(check == 1) {
				alunos[i] = new Aluno();
				
				System.out.println("Digite a Matrícula : ");
				alunos[i].setMatricula(scan.nextInt());
				scan.nextLine();
				System.out.println("Digite o Nome: ");
				alunos[i].setNome(scan.nextLine());
				System.out.println("Digite a sua primeira nota do Aluno: ");
				alunos[i].setNota1(scan.nextDouble());
				System.out.println("Digite a sua segunda nota do Aluno: ");
				alunos[i].setNota2(scan.nextDouble());
				
				alunosList.add(alunos[i]);
				i++;
				
				System.out.println("\n1- Cadastrar um aluno;"+"\n2- Buscar um aluno pelo nome;"+ "\n3- Exibir a lista de alunos;"+ "\n4- Calcular a media da turma;"+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 2) {
				scan.nextLine();
				System.out.println("Digite o nome que queira procurar: ");
				nome = scan.nextLine();
				for(int k=0; k<alunosList.size(); k++) {
					if(alunos[k].Check(nome)) {
						System.out.println(alunos[k].toString());
					}
				}
				System.out.println("Aluno não cadastrado!");
				System.out.println("\n1- Cadastrar aluno;"+ "\n2- Buscar um aluno pelo nome;"+ "\n3- Exibir a lista de alunos;"+ "\n4- Calcular a média da turma;"+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 3) {
				for(int k=0; k<alunosList.size(); k++) {
					System.out.println(alunosList.get(k).toString());
				}
				System.out.println("\n1- Cadastrar aluno;"+ "\n2- Buscar um aluno pelo nome;"+ "\n3- Exibir a lista de alunos;"+ "\n4- Calcular a média da turma;"+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 4) {
				for(int k=0; k<alunosList.size(); k++) {
					soma = soma + alunos[k].Media();
				}
				System.out.println("A média da turma é: "+(soma/alunosList.size()));
				System.out.println("\n1- Cadastrar aluno;"+ "\n2- Buscar um aluno pelo nome;"+ "\n3- Exibir a lista de alunos;"+ "\n4- Calcular a média da turma;"+ "\n5- Sair;");
				check = scan.nextInt();
			}
		}
		
		System.out.println("\nTerminando o programa...");
	}

}