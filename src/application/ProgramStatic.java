package application;

import java.util.Locale;

import util.StaticCalculator;

public class ProgramStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//Como os membros são estáticos não é necessário instanciar um objeto StaticCalculator
		//StaticCalculator circulo = new StaticCalculator();
		
		
		double radius = 3.00;
		double PI = StaticCalculator.PI;
		double circumference = StaticCalculator.calculaCircuferencia(radius);
		double volume = StaticCalculator.calculaVolume(radius);
		
		System.out.println("\nRadius value: " + String.format("%.2f", radius));
		System.out.println("PI value: " + String.format("%.2f", PI));
		System.out.println("Circumference value: " + String.format("%.2f", circumference));
		System.out.println("Volume value: " + String.format("%.2f", volume));

	}

}
