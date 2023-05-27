package exercicioListas;

public class Funcionario {
	private int id;
	private String nome;
	private float salario;
	private int percent = 0;
	
	public void aumentarEmDez(int id, int percent) {
		if(this.id == id) {
			this.salario += this.salario * percent/100;
		}else {
			System.out.println("Id informado nao existe, refaça a operação.");
		}
	}
	

	public Funcionario(int id, String nome, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
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
