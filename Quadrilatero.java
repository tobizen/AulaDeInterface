
public abstract class Quadrilatero implements FormaGeometrica{
	
	int x,y,z,w;
	
	public Quadrilatero(int x,int y, int z, int w) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public double perimetro() {
		
		return this.x + this.y + this.z + this.w;
	}
	

}
