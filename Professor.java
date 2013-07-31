/** Classe Professor */
public class Professor extends Pessoa{
	//Atributos
	private String departamento;
	//Métodos
	public Professor(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
}

