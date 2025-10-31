package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import entities.Triangle;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os valores do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do triangulo y: ");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		Double areaX = x.area();
		Double areaY = y.area();
		String resultado = (areaX > areaY) ? "X" : "Y";
		System.out.println("Area de X: " + areaX);
		System.out.println("Area de y: " + areaY);
		System.out.println("O triangulo com maior are é o: " + resultado);
		
		//parte 2
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		System.out.println("Enter quantity to add: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println("Updated " + product);
		System.out.println("Enter quantity to remove: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println("Updated " + product);
		sc.close();
	}
}