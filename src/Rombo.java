
public class Rombo implements Figura{
	
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return (diagonalMayor*diagonalMenor)/2;
	}
	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	
	
}
