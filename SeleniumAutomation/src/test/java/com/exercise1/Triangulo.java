package com.exercise1;

public class Triangulo extends Poligono {

	private double lado1, lado2, lado3, base, altura;
	
	//Constructor default
	public Triangulo() {
		
	}
	
	//Constructor perimetro
	public Triangulo (double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	//Constructor area
	public Triangulo (double base, double altura) {
		super(3);
		this.base = base;
		this.altura = altura;
	}
	
	//Encapsulacion
		public void setLado1(double lado1) {
			this.lado1 = lado1;
		}
		
		public double getLado1() {
			return lado1;
		}
		
		public void setLado2(double lado2) {
			this.lado2 = lado2;
		}
		
		public double getLado2() {
			return lado2;
		}
		
		public void setLado3(double lado3) {
			this.lado3 = lado3;
		}
		
		public double getLado3() {
			return lado3;
		}
		
		//Metodos
		@Override
		public String toString() {
			String message = "Triangulo " + super.toString() +
					"\nLado 1= " + lado1 + " , lado 2= " + lado2 +
					", lado 3= " + lado3;
			return message;
		}
		
		@Override
		public double area() {
			return base * altura / 2;
		}
		
		@Override
		public double perimetro() {
			return lado1 + lado2 + lado3;
		}
}
