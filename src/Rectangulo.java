
public class Rectangulo implements Figura{
	private String name;
	private double base;
	private double altura;
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return (2*base)+(2*altura);
	}
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
	
}
