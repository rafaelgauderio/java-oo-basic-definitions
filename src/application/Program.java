package application;

import entitites.Triangle;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Memória Stack\n"
				+ "Área onde são criadas as variáveis estáticas"
				+ "\nMemória Heap\n"
				+ "Área onde fica a alocação dinâmica de memória. Ali ficam os objectos dinâmicos.\n"
				+ "A variável tri abaixo, por exemplo, armazena o endereço de memória da variável\n"
				+ "do tipo triangulo instanciada na memória heap.\n");
		
		//variáveis estáticas
		double x =1.17;
		double y =2.19;
		double z = 3.14;		
		
		//objeto dinâmico
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
