package ProjetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// Programa Principal
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 =new Funcionario();
		
		 p1.setIdade(24);
         p2.setIdade(22);
         p3.setIdade(36);
         p4.setIdade(34);
         
         p2.setCurso("Informatica");
         p3.setSalario(2500.75f);
         p4.setSetor("Estoque");
        
         
         p1.setSexo("M");
         p2.setSexo("F");
         p3.setSexo("M");
         p4.setSexo("F");
		
         p1.setNome("Matheus");
         p2.setNome("Angi");
         p3.setNome("Wagner");
         p4.setNome("Fabiana");
         
         System.out.println(p1.toString());
         System.out.println(p2.toString());
         System.out.println(p3.toString());
         System.out.println(p4.toString());
	}

}
