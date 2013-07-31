public class Curso {
	int codCurso;
	String nome;
	Date dataAbertura;
	GradeCurricular gradeCurricular;

	public Curso(int codCurso, String nome, Date dataAbertura) {
		this.codCurso = codCurso;
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}

	public void setGradeCurricular(GradeCurricular g) {
		this.gradeCurricular = g;
	}

	public GradeCurricular getGradeCurricular() {
		return this.gradeCurricular;
	}
}
