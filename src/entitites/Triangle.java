package entitites;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle () {
		
	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double areaTrianglo() {
		double p = (this.a +this.b + this.c)/2.0;
		return Math.sqrt(p*(p-this.a) * (p - this.b) * (p-this.c));
	}
	
	public static String compareSize (Triangle t1, Triangle t2) {
		if(t1.areaTrianglo() > t2.areaTrianglo()) {
			return "A triângulo 1 têm área maior";  
		} else {
			return "A triângulo 2 têm área maior"; 
		}
	}

	@Override
	public String toString() {
		return "Triangle [sideA =" + String.format("%.2f",a) + ", sideB =" + String.format("%.2f",c) + ", sideC =" + String.format("%.2f",b) + ", Triangle Area: " + String.format("%.2f", this.areaTrianglo()) + "]";
	}
	
	
	
	

}
