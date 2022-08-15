package ProjetoPessoas;

public class Professor extends Pessoa {
       private String Especialidade;
       private float salario;
       
       public void receberAumento(float aum) {
    	   this.salario += aum;

	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
       
       

}
