package com.ap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, delta, rishe1, rishe2;
			System.out.println("a:");
				a = scanner.nextDouble();
			System.out.println("b:");
				b = scanner.nextDouble();
			System.out.println("c:");
				c = scanner.nextDouble();
			delta = b * b - 4 * a * c;
			if (delta >= 0) {
				rishe1 = (-b + Math.sqrt(delta) / (2 * a));
				rishe2 = (-b - Math.sqrt(delta) / (2 * a));
				System.out.println("rishe1:" + rishe1);
				System.out.println("rishe:" + rishe2);


		}
			else System.out.println("delta rishe nadarad");
	}
}