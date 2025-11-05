package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import entities.Triangle;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double a, b, c;
		Triangle x, y;
		
		System.out.println("Digite os valores do triangulo X: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		x = new Triangle(a, b, c);
		System.out.println("Digite os valores do triangulo y: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		y = new Triangle(a, b, c);
		
		Double areaX = x.area();
		Double areaY = y.area();
		String resultado = (areaX > areaY) ? "X" : "Y";
		System.out.println("Area de X: " + areaX);
		System.out.println("Area de y: " + areaY);
		System.out.println("O triangulo com maior are é o: " + resultado);
		
		//parte 2

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		System.out.println(product);
		System.out.println("Enter quantity to add: ");
		quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println("Updated " + product);
		System.out.println("Enter quantity to remove: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println("Updated " + product);
		sc.close();
	}
}