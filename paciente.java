package modelo;

public class paciente {
	String nome,tel,cpf;;
	int codigo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String toString(){
		System.out.print("Codigo: "+codigo+"\nNome: "+nome+"\nCPF: "+cpf+"\nTelefone: "+tel);
		System.out.println();
		return nome;
	}
}

	
