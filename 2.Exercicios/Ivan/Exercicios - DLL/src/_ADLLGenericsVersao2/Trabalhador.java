package _ADLLGenericsVersao2;

// Classe relativa a um Trabalhador 
// contendo os atributos registro de funcionário (refFunc), 
// id, idade, sexo, salario e
// cargo. Além dos métodos getters, setters, construtor
// e toString.
//Autor1: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 10/10/2024. 15h.
public class Trabalhador{
		private int id, idade;
		private String regFunc;
		private char sexo;
		private float salario;
		private String cargo;
		public Trabalhador(int id, int idade, String regFunc, char sexo, float salario, String cargo){ 
			this.id = id; 
			this.idade = idade;
			this.regFunc = regFunc;
			this.sexo = sexo;
			this.salario = salario; 
			this.cargo = cargo;
		}
		public int getId(){
	    		return id;
	  	}
		public int getIdade(){
    		return idade;
  	    }
		public String getRegFunc() {
			return regFunc;
		}
		public char getSexo(){
    		return sexo;
		}
	  	public float getSalario(){
	    		return salario;
	 	}
	  	public String getCargo(){
    		return cargo;
 	    }
	  	public void setId(int id){
	    		this.id = id;
	  	}
	  	public void setIdade(int idade){
    		this.idade = idade;
	  	}
	  	public void setRegFunc(String regFunc) {
	  		this.regFunc = regFunc;
	  	}
	  	public void setSexo(char sexo){
    		this.sexo = sexo;
	  	}
	  	public void setSalario(float salario){
	    		this.salario = salario;
	  	}
	  	public void setCargo(String cargo){
    		this.cargo = cargo;
  	    } 
		@Override
		public String toString()  {
				StringBuilder sb = new StringBuilder();
				sb.append("\n[Trabalhador] ")
					.append("reg.:")
					.append(regFunc)
					.append(", id: ")
					.append(id)
					.append(", sexo: ")
					.append(sexo)
					.append(", idade: ")
					.append(idade)
					.append(", cargo: ")
					.append(cargo)
					.append(", salário: ")
					.append(salario);					
				return sb.toString();
		}
}
