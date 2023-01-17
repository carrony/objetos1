package app;

import clases.Empleado;
import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		int num;
//		
		Persona p = new Persona();
		//p.nombre="eee";
//		
//		p.nombre="David";
//		p.dni="3000000A";
//		p.altura=180;
//		p.peso=80;
		
//		System.out.printf("te llamas %s y tu imc"
//				+ " es %.2f", p.nombre, 
//				p.calculaIMC());
		
		Persona otra = new Persona("Ana","4000000B",165,24,58.3);
		
		System.out.println("El nombre de la persona es "+otra.getNombre());

		Empleado e = new Empleado();
		e.sueldo=3000;
		

	}

}
