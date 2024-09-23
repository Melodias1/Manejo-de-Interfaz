
public class Cuadrado implements Figura {
	
	private String name;
	private double lado;
	
	
	
	
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}
	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
	

}
