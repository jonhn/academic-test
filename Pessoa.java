/*
* Declaraçao de classe Abstrata Pessoa
*/
public abstract class Pessoa
{
	
	//Declaração de atributos da classe	
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	private String email;
	
	//Métodos de acesso
	public String getNome()
	{
		return nome;
	}

	public String getSobreNome()
	{
		return sobrenome;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public String getEmail()
	{
		return email;
	}

	//Métodos de modificação
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setSobreNome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}	
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

}
