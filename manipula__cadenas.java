package com.ipartek;

public class manipula__cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Jonathan";

		System.out.println("mi nombre es : " + nombre);
		
		System.out.println("Mi nombre tiene: " + nombre.length() + " letras");

		System.out.println("Mi nombre tiene: " + nombre.substring(0, 5) + " letras");

		System.out.println("Mi nombre tiene: " + nombre.equals(nombre));

		System.out.println("Mi nombre tiene: " + nombre.equalsIgnoreCase(null));

		System.out.println("la primera letra de  : " + nombre + " es la letra: " + nombre.charAt(0));

		int ultima_letra = nombre.length();

//		ultima_letra = nombre.length();

		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra - 4));

	}

}
