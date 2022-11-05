package application;

import entitites.Triangle;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Mem�ria Stack\n"
				+ "�rea onde s�o criadas as vari�veis est�ticas"
				+ "\nMem�ria Heap\n"
				+ "�rea onde fica a aloca��o din�mica de mem�ria. Ali ficam os objectos din�micos.\n"
				+ "A vari�vel tri abaixo, por exemplo, armazena o endere�o de mem�ria da vari�vel\n"
				+ "do tipo triangulo instanciada na mem�ria heap.\n");
		
		//vari�veis est�ticas
		double x =1.17;
		double y =2.19;
		double z = 3.14;		
		
		//objeto din�mico
		Triangle tri;
		tri = new Triangle();
		tri.setA(x);
		tri.setB(y);
		tri.setC(z);
		
		Triangle triangulo1 = new Triangle(1.3, 2.5, 3.6);
		Triangle triangulo2 = new Triangle(3, 2.4, 4.1);

		System.out.println(triangulo1);
		System.out.println(triangulo2);
		System.out.println(tri);
	}

}
