
public class Retangulo implements FormaGeometrica{
	int x, y;
	
	
	public Retangulo(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public double perimetro() {
		return (2*this.x) + (2*this.y);
		
	}
	public double area() {
		return this.x * this.y;
	}
	
	@Override
	public String toString() {
		return "Os dois lados sao: "+this.x +", "+ this.y;
	}
	

}
