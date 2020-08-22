package com.javabasics;

public class CondicionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidad = 70;
		int limite = 60;
		
		//IF
//		if (velocidad > limite) {
//			System.out.println("Excede el límite de velocidad!");
//		}
		
		//IF ELSE
//		if (velocidad > limite) {
//			System.out.println(velocidad + " excede el límite de velocidad!");
//		}else {
//			System.out.println(velocidad + " es una velocidad permitida");
//		}
		
		// IF ANIDADOS
//		boolean highway = true;
//		if (highway == true) {
//			System.out.println("I'm on the highway to hell");
//			limite = 80;
//			if (velocidad > limite) {
//				System.out.println(velocidad + " excede el límite de velocidad!");
//			}else {
//				System.out.println(velocidad + " es una velocidad permitida");
//			}
//		}
		
		//IF ELSE IF
//		boolean highway = false;
//		if (highway == true) {
//			System.out.println("I'm on the highway to hell");
//			limite = 80;
//			if (velocidad > limite) {
//				System.out.println(velocidad + " excede el límite de velocidad!");
//			}else {
//				System.out.println(velocidad + " es una velocidad permitida");
//			}
//		}else if (velocidad > limite){
//			System.out.println("No está permitido andar a " + velocidad + " fuera de la carretera");
//		}else {
//			System.out.println("Está permitido ir a " + velocidad + " fuera de la carretera");
//		}
		
		//SWITCH CASE
		int temperature = 30;
		switch (temperature) {
		case 10:
			System.out.println(temperature + " grados es frío");
			break;
		case 20:
			System.out.println(temperature + " grados es agradable");
			break;
		case 30:
			System.out.println(temperature + " grados es calor");
			break;
		case 40:
			System.out.println(temperature + " grados! Qué gonorrea de calor");
			break;
		default:
				System.out.println("Ni va ni viene");
				break;
		}
	}

}
