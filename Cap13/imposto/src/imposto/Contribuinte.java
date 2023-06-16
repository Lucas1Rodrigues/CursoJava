package imposto;

public abstract class Contribuinte {
	
	protected String name;
	protected Double rendaAnual;
	
	//constructors
	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public Contribuinte() {
		
	}
	
	//get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	//especial methods
	public abstract Double calculoImposto();

}
