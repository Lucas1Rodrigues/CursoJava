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
		Double imposto = 0.0;
		if(this.numeroFuncionarios >= 10) {
			imposto = this.rendaAnual * 0.14;
		}else {
			imposto = this.rendaAnual * 0.16;
		}
		return imposto;
	}


	@Override
	public String toString() {
		return   name + ": $" + calculoImposto();	}
	
}
