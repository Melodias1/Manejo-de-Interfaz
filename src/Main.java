
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo("bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("t", 87, 121, 110);
		imprimirFigura(t1);
		imprimirFigura(t);
		Cuadrado c1= new Cuadrado("pants", 5);
		Rectangulo r1 = new Rectangulo("rectangulito", 10, 5);
		Rombo ro1 = new Rombo("rambito", 5, 6, 4);
		Romboide romboide1=new Romboide("romboito", 8, 15);
		Trapecio trap1= new Trapecio("trapecito", 4, 5, 8, 5, 4, 8, 5);
		
		imprimirFigura(c1);
		imprimirFigura(r1);
		imprimirFigura(ro1);
		imprimirFigura(romboide1);
		imprimirFigura(trap1);
		
	}//main		
	
	public static void imprimirFigura(Figura t) {
		System.out.println(t);
		System.out.println("===========================");
		System.out.println("| el area de["+t.getName()
				+ "] es: "+t.calcArea());
		System.out.println("| elperimetro de["+t.getName()
		+ "] es: "+t.calcPeri());
		System.out.println("===========================");
	}

}//class
