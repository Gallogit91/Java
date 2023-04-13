package com.ipartek1;
import javax.swing.*;
public class Prueba_DoWhile_JOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Jonathan";
		String pass = "";
		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce tu pass por favor");

			if (clave.equals(pass) == false) {

				System.out.println("contraseña incorrecta");
			}

		}
		System.out.println("Contraseña Correcta , acceso permitido");
	}



		
	}


