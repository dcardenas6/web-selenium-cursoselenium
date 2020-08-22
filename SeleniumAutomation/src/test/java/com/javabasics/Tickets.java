package com.javabasics;

public class Tickets {

	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	//CONSTRUCTOR
	public Tickets (int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "precio normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
		
	}
	
	
	//METODOS
	
	public void costoDia() {
		System.out.println("El costo del ticket es " + costo);
	}
	
	public void precioAdulto() {
		System.out.println("Valor ticket adulto " + precioAdulto);
	}
	
	public void precioNino() {
		System.out.println("Valor ticket nino " + precioNino);
	}
	
	public void precioEstudiante() {
		System.out.println("VAlor ticket de estudiante " + precioEstudiante);
	}
	
	public void verificarCostoTicket() {
		if (estudiante == true) {
			System.out.println("Eres un estudiante. Precio del ticket es " + precioEstudiante);
		}else if (edad > 18) {
			System.out.println("Eres un adulto. Precio del ticket es " + precioAdulto);
		}else {
			System.out.println("Eres un f*cking niño. Precio del ticket es " + precioNino);
		}
	}
	
	
	//SOBRECARGA
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println("Valor suma sin descuento " + suma);
		return suma;
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNino) - descuento;
		System.out.println("Suma con duescuento " + suma);
		return suma;
	}
	
	public double sumarTicket(int descuento, int descuentoExtra) {
		double suma = (precioAdulto + precioNino) - descuento - descuentoExtra;
		System.out.println("Suma con duescuento extra " + suma);
		return suma;
	}
	
	
	//EJERCICIO: GENERAR UN CONSTRUCTOR NUEVO, SOBRECARGADO, CON ARGUMENTO "DESCUENTO". 02:15:00 en video
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tickets tickets = new Tickets(100, 19, true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTicket(10,12);
		
	}

}
