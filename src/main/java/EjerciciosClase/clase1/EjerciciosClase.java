package com.clase1;
import java.lang.Math;

public class EjerciciosClase {

	public static void PrintNPrimos(int cantidad) {
		int num=1;
		for(int cantPrimos=0;cantPrimos<cantidad;num++) {	
			if(EsPrimo(num) == 1){
				cantPrimos++;
				System.out.println(cantPrimos+"° "+num + " es primo");	
			}
		}
		
	}
	
	public static int EsPrimo(int num) {
		for(int divisor=2;divisor <= Math.sqrt(num);divisor++) {
			if(num%divisor==0) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void ImprimirMatriz(int[][] matriz) {
		for(int[] fila :matriz) {
			System.out.println();
			for(int e : fila) {
				System.out.print(e);		
			}
		}
	}
}
