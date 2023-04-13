package com.ipartek1;

import java.util.*;
import javax.swing.*;

public class Prueba_While_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CON SCANNER
		
		System.out.println("Introduce tu pass por favor");
		
		Scanner sc=new Scanner(System.in);
		
		String clave = "Jonathan";
		String pass = "";
		while (clave.equals(pass) == false) {
			
		
			pass=sc.next();

			if (clave.equals(pass) == false) {

				System.out.println("contraseña incorrecta");
			}

		}
		System.out.println("Contraseña Correcta , acceso permitido");
	}

}
