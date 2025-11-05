package entities;

public class Triangle {
	public Double a;
	public Double b;
	public Double c;

	public Triangle( Double a, Double b, Double c){
			this.a = a;
			this.b = b;
			this.c = c;
	}

	public double area() {
		
		Double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
}
