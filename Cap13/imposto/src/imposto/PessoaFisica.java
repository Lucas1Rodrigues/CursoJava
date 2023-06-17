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
	
	//getters and setters
	
	public Double getGastosComSaúde() {
		return gastosComSaúde;
	}


	public void setGastosComSaúde(Double gastosComSaúde) {
		this.gastosComSaúde = gastosComSaúde;
	}


	//especial method
	@Override
	public Double calculoImposto() {
		Double imposto = 0.0;
		if (this.rendaAnual < 20000.0) {
			imposto = this.rendaAnual * 0.15;
			imposto -= (this.gastosComSaúde)/2; 
		}else {
			imposto = this.rendaAnual * 0.25;
			imposto -= this.gastosComSaúde/2;
		}
		
		return imposto;
		
	}

	
	@Override
	public String toString() {
		return   name + ": $" + calculoImposto();
	}
	
	
	
	
	
	

}
