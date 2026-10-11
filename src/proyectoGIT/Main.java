package proyectoGIT;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Hola mundo");
		System.out.println("¿Cúal es tu nombre?");
		
		String nombre = sc.nextLine();
		System.out.println("Hola "+nombre);
		
		System.out.println("¿Cúantos años tienes "+nombre+"?");
		int edad = sc.nextInt();
		
		System.out.println("Estás grande colega");
		
		sc.close();

	}

}
