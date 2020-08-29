package com.exercise1;

public abstract class Poligono {

	private int numLados;
	
	//Constructor
	public Poligono() {
		
		
	}
	
	//Constructor lados
	public Poligono(int numLados) {
		this.numLados = numLados;
	}
	
	//Encapsular Setter y Getter
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public int getNumLados() {
		return numLados;
	}
	
	//Numero de lados
	@Override
	public String toString() {
		return "Numero de lados: " + numLados;
	}
	
	//Metodos de abstraccion
	public abstract double area();
	public abstract double perimetro();
	
}
