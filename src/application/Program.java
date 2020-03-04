package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.next();
		scan.nextLine();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		scan.nextLine();

		Product product = new Product(name, price);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in sotck: ");
		int quantity = scan.nextInt();
		scan.nextLine();
		product.addProcuts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from sotck: ");
		quantity = scan.nextInt();
		scan.nextLine();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		scan.close();

	}

}
