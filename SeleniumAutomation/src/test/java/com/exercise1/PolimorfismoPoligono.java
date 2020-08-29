package com.exercise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {

		//Objeto Poligono
		Poligono poligono1 = new Rectangulo(4,4,2,2);
		System.out.println(poligono1.toString());
		double perimetro1 = poligono1.perimetro();
		System.out.println("El perimetro del rectangulo es " + perimetro1);
		
		poligono1 = new Rectangulo(2,4);
		double area1 = poligono1.area();
		System.out.println("El area del rectangulo es " + area1);
		
		poligono1 = new Triangulo(2,3,3);
		System.out.println(poligono1.toString());
		double perimetro2 = poligono1.perimetro();
		System.out.println("El perimetro del triangulo es " + perimetro2);
		
		poligono1 = new Triangulo(2,3);
		double area2 = poligono1.area();
		System.out.println("El area del triangulo es " + area2);
		
	}
	
	//Ejercicio con un trapecio con lados, area y perimetro

}
