package imposto;

public class PessoaJuridica extends Contribuinte {
	private int numeroFuncionarios;
	
	//constructors
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	//getters and setters
		
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public Double calculoImposto() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
