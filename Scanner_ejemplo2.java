package com.ipartek1;

import java.util.Scanner;

public class Scanner_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner datos = new Scanner(System.in);
	
	System.out.println("Introduce el procesador");
	
	String procesador= datos.nextLine();
	
	System.out.println("Cantidad de memoria RAM");

	int ram=datos.nextInt();
	
	System.out.println("Grafica : Introduce Nvidia o AMD");
	
	String grafica=datos.next();
	
	System.out.println("Tienes un procesador : "+ procesador + " , con" +ram+ "GB de RAM y una tarjeta grafica modelo " +grafica );

	
	
	
	
	}

}
