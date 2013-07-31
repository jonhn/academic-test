/** Classe Aluno */

public class Aluno extends Pessoa{

	//Atributos
	private String matricula;
	private Curso curso;

	//Métodos
	public Aluno(Srtring matricula){
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula(){
		return this.matricula;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
        public Curso getCurso(){
                return this.curso;
        }
        public void setCurso(Curso curso){
                this.curso = curso;
        }
