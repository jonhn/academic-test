public Enum Logradouro { RUA, AVENIDA, TRAVESSA, SITIO, CHACARA, VILA };

public class Endereco {
	Logradouro logradouro;
	String nome;
	int numero;
	String complemento;

	public Endereco(Logradouro logradouro, String nome, int numero, String complemento) {
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
		this.complemento = complemento;
	}
}
