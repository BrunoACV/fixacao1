package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();
		System.out.println("Enter the width: ");
		retangle.width = sc.nextDouble();
		System.out.println("Enter the height: ");
		retangle.height = sc.nextDouble();

		System.out.printf("Area= %.2f%n", retangle.area());
		System.out.printf("perimeter= %.2f%n", retangle.perimeter());
		System.out.printf("diagonal= %.2f%n", retangle.diagonal());
		sc.close();
	}

}
