package exercicioListas;

public class Funcionario {
	private String id;
	private String nome;
	private float salario;
	private int percent;
	
	public void aumentarEmDez(String id, int percent) {
		this.percent = percent/100;
		if(this.id == id) {
			this.salario = (float) (this.salario + (this.salario * percent));
		}else {
			System.out.println("Id informado nao existe, refaça a operação.");
		}
	}
	

	public Funcionario(String id, String nome, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}
