package Circulo;

public class circle {
	String cor= "Vermelho";
	double raio=1;
	
	public circle(double raio, String cor){
		this.raio = raio;
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double CalculaArea(circle c) {
		
		double area= Math.PI*Math.pow(c.getRaio(), 2);
		return area;
	}
	public String toString() {
		return ( "\nRaio do circulo: "+ raio+ "\nCor do circulo: "+ cor );
	}
}