package imposto;

public class PessoaFisica extends Contribuinte{
	private Double gastosComSaúde;
	
	
	//Constructors
	public PessoaFisica() {
		super();
	}
	
		
	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaúde) {
		super(name, rendaAnual);
		this.gastosComSaúde = gastosComSaúde;
	}

	//especial method
	@Override
	public Double calculoImposto() {
		return null;
		
	}
	
	

}
