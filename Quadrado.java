
public class Quadrado implements FormaGeometrica{
		int x;
	public Quadrado(int x) {
		this.x = x;
	}
	
	public double area() {
		return this.x * this.x;
	}
	public double perimetro() {
		return this.x*4;
	}
	@Override
	public String toString() {
		return "O lado é: "+this.x;
	}

}
