/** Classe matricula */
public class Matricula{
	//Atributos
	private Aluno aluno;
	private Curso curso;
	//Métodos
	public Matricula(Aluno aluno, Curso curso){

		this.aluno = aluno;
		this.curso = curso;

	}
	//Método de matrícula
	public Aluno matricular(){
		this.getAluno().setCurso(this.getCurso());
	}
	//Métodos de acesso e modificação
	public Aluno getAluno(){
		return this.aluno;
	}
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	public Curso getCurso(){
		return this.curso;
	}
	public void setCurso(Curso curso){
		this.curso = curso;
	}
}
