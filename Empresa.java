package modelo;

public class Empresa {
	private String nome, cnpj, endereco, cidade, estado, telefone;
	private int funcionarios;
	
	public Empresa(String nome, String cnpj, String endereco, String cidade, String estado, String telefone, int funcionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.funcionarios = funcionarios;
	}
	
	public Empresa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdFunc() {
		return funcionarios;
	}

	public void setQtdFunc(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public String toString() {
		return "\nNome: "+nome+"\nCNPJ: "+cnpj+"\nEndereço: "+endereco+"\nCidade: "+cidade+"\nEstado: 				"+estado+"\nTelefone: "+telefone+"\nQuantidade de funcionários: "+funcionarios;
	}
	
	public boolean comparaNome(String nome) {
		return (this.nome.equals(nome));
	}
	
	public int Check(int valor) {
		if(funcionarios > valor) {
			return funcionarios;
		}else {
			return valor;
		}
	}
	
	
}