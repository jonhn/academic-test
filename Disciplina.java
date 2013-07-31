public class Disciplina {
	int codDisciplina;
	String nome;
	int creditos;
	List<Disciplina> listDiscipPreReq;

	public Disciplina(int codDisciplina, String nome, int creditos) {
		this.codDisciplina = codDisciplina;
		this.nome = nome;
		this.creditos = creditos;
		this.listDiscipPreReq = new ArrayList<Disciplina>();
	}

	public void addDiscipPreReq(Disciplina d) {
		
	}

	public void remDiscipPreReq(Disciplina d) {

	}
}
