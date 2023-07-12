package generics;

public class MinhaClasee<T extends Number> {
	private T obj;

	public MinhaClasee(T obj) {
		this.obj = obj;
	}
	public Double aoQuadrado(MinhaClasee<?> naoSei) {
			return Math.abs(obj.doubleValue())* Math.abs(obj.doubleValue());
		}
	
	
	
}
