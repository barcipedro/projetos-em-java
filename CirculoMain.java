package Circulo;


public class CirculoMain {
	

	public static void main(String[] args) {		

		circle c1, c2;
		c1 = new circle(5, "Preto");
		c2 = new circle(3, "Amarelo");
		System.out.println( c1.toString() + "\nO valor da area do c1 e: " + c1.CalculaArea(c1));
		System.out.println( c2.toString() + "\nO valor da area do c2 e: " + c2.CalculaArea(c2));
	}
}

