package ar.com.unpaz.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio  {
	
	public static void ejercicio1() {
		List<Integer> miLista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> resultado = miLista.stream()
								  .filter(x ->x%2==0)
								  .map(s -> s*s)
								  .collect(Collectors.toList());
		System.out.println(resultado);
	}
	
	public static void ejercicio2() {
		List<String> miLista = Arrays.asList("PEZ","PERRO","ATUN","GATO","AVE","DINOSAURIO","BALLENA","LEON","COCODRILO","PIE","SOL");
	    /*Stream<String> resultado =  miLista.stream()
								   .filter(x-> x.length()>3)
								   .map(x -> x.toLowerCase());
	    System.out.println(resultado.toList());*/
		long count = miLista.stream()
					 .filter(x->x.length()>3)
					 .map(x ->x.toLowerCase())
					 .count();
		System.out.println(count);	    
								   
					   
	}
	
	public static void ejercicio3() {
		Persona p1 = new Persona("Pedro",19);
		Persona p2 = new Persona("Magali",17);
		Persona p3 = new Persona("Rosaura",65);
		Persona p4 = new Persona("Felix",40);
		Persona p5 = new Persona("Micky",20);
		Persona p6 = new Persona("Inti",15);
		Persona p7 = new Persona("Veronica",29);
		Persona p8 = new Persona("Homero",55);
		Persona p9 = new Persona("Bart",12);
		Persona p10 = new Persona("Koji",11);
		
		List<Persona> miLista = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
		int suma = miLista.stream()
					.filter(x -> x.getEdad()>18)
					.mapToInt(Persona::getEdad)
					.sum();
					
		System.out.println("resultado :"+suma);
					
	}

}
