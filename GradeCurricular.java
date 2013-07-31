public class GradeCurricular {
	int codGrade;
	int ano;
	int semestre;
	List<Disciplina> listDisciplinas;

	public GradeCurricular(int codGrade, int ano, int semestre) {
		this.codGrade = codGrade;
		this.ano = ano;
		this.semestre = semestre;
		listDisciplinas = new ArrayList<Disciplina>();
	}

	public void addDisciplina(Disciplina d) {

	}

	public void remDisciplina(Disciplina d) {

	}

	public Disciplina getDisciplina(int codDisciplina) {
		return null;
	}
}
