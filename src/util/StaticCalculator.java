package util;

public class StaticCalculator {

	public static final double PI = 3.14159265;
	
	public static double calculaCircuferencia(double radius) {
		
		return 2.0 * PI * radius;
	}
	
	public static double calculaVolume (double radius) {
		return (4 * PI * Math.pow(radius,3)) / 3.0;
	}
	
}
