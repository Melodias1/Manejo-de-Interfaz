
public class Triangulo implements Figura {
	private String name;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String name, double base, double altura, double lado) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Triangulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	
	public double calcArea() {
		return (getBase()*getAltura())/2;
	}//calcArea
public double calcPeri() {
	return getLado()+getLado()+getLado();
		
	}//calcPeri
}//class
