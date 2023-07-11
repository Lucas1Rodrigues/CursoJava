package entities;

public class Circle extends AbstractShape {

	private Double radius;
	

	public Circle(Double radius) {
		this.radius = radius;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	@Override
	public Double area() {
			return (radius*radius * 3.14);
	}
	
	
}
