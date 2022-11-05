package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class ProgramProdutct {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product ("Compute",2500.50,15);
		System.out.println("\n\nNome do produto " + p1.getName() + ", preco: " + p1.getPrice() + ", quantidade em estoque: " + p1.getQuantity());
		System.out.println(p1);
		
		System.out.println("\nAdding 50 items");
		p1.addProducts(50);
		System.out.println(p1);
		
		System.out.println("\nRemoving 20 itens");
		p1.removeProducts(20);
		System.out.println(p1.toString());
		
		Product p2 = new Product();
		p2.setName("Notebook");
		p2.setPrice(1900.25);
		p2.setQuantity(500);
		
		System.out.println("\n\n" + p2 );
		System.out.println("Enter a quantity of products to be added in stock : ");
		int quantity = sc.nextInt();
		System.out.println("You have inform " + quantity + ", printing update Product data: ");
		p2.addProducts(quantity);
		System.out.println(p2.toString());
		
		
		
	}

}
