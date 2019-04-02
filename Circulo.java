
public class Circulo implements FormaGeometrica{
	
	int r;
	
	public Circulo(int r) {
		this.r =r;
	}
	public double area() {
		return 2.14*this.r*this.r;
	}
	public double perimetro() {
		return 2*2.14*this.r;
	}
	@Override
	public String toString() {
		return "O raio é: "+this.r;
	}

}
