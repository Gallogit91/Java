package com.ipartek1;

import java.util.*;

public class If_Else_If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nota");

		int nota = sc.nextInt();

		if (nota <5) {

			System.out.println("Suspenso");
		}
		if (nota == 5) {
			System.out.println("Suficiente");
		}
		if (nota ==6) {
			System.out.println("Bien");
		}

		if (nota >=7 && nota <=8) {
			System.out.println("Notable ");
		}

		if (nota ==9) {
			
			System.out.println("Notable Alto");
		}
		if (nota == 10) {
			System.out.println("Sobresaliente");
		}

	}

}
