package application;

public class ProgramForms {
	
	public static final double PI = 3.14159265;
	
	public static void main (String [] args ) {
		
		double radius = 2.00;
		double circumference = calculaCircuferencia(radius);
		double volume = calculaVolume(radius);
		
		System.out.println("\nRadius value: " + String.format("%.2f", radius));
		System.out.println("Circumference value: " + String.format("%.2f", circumference));
		System.out.println("Volume value: " + String.format("%.2f", volume));
			
	}

	private static double calculaCircuferencia(double radius) {
		
		return 2.0 * PI * radius;
	}
	
	private static double calculaVolume (double radius) {
		return (4 * PI * Math.pow(radius,3)) / 3.0;
	}

}
