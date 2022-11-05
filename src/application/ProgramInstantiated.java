package application;

import java.util.Locale;

import util.Calculator;

public class ProgramInstantiated {
	
	public static void main (String [] args ) {
		
		Locale.setDefault(Locale.US);
		//Como os membros não são estáticos é necessário instanciar um objeto Calculator
		Calculator circulo = new Calculator();
		
		
		double radius = 3.00;
		double PI = circulo.PI;
		double circumference = circulo.calculaCircuferencia(radius);
		double volume = circulo.calculaVolume(radius);
		
		System.out.println("\nRadius value: " + String.format("%.2f", radius));
		System.out.println("PI value: " + String.format("%.2f", PI));
		System.out.println("Circumference value: " + String.format("%.2f", circumference));
		System.out.println("Volume value: " + String.format("%.2f", volume));
	}
	

		

}
