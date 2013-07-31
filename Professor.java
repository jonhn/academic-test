public class Professor extends Pessoa{

	private String departamento;
	
	public Professor(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	publci void setDepartamento(String departamento){
		this.departamento = departamento;
	}
}

