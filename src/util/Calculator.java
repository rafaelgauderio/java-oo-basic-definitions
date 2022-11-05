package util;

public class Calculator {

	public final double PI = 3.14159265;
	
	public double calculaCircuferencia(double radius) {
		
		return 2.0 * PI * radius;
	}
	
	public double calculaVolume (double radius) {
		return (4 * PI * Math.pow(radius,3)) / 3.0;
	}
	
}
