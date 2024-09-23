
public class Trapecio implements Figura {
	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double baseMenor,
			double baseMayor, double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
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
		return ((baseMayor+baseMenor)*altura)/2;
	}
	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return lado1+lado2+lado3+lado4;
	}
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura=" + altura + "]";
	}
	
}
