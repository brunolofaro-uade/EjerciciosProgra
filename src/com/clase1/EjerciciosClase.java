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
	
	public static int GetCantidadDigitos(int num) {
		if(num==0)
			num++;
		return (int)Math.floor(Math.log10(Math.abs(num))+1);
	}
	
	public static long SumarDigitosFor(double num) {
		String strNum = Double.toString(num);
		long res = 0;
		for(int i =0 ; i<strNum.length(); i++) {
			char caracter = strNum.charAt(i);
			if((int)caracter >= 48 && (int)caracter <=57) {		
				num = Math.abs(Character.getNumericValue(caracter));
				res += num;
			}
		}
		return res;
	}
	public static int SumarDigitosRec(int num) {
		if(num == 0)
			return num;
		return num%10 + SumarDigitosRec(num/10);
	}
	
	public static void ImprimirDivisores(int numero, int divisor) {
		if(divisor > numero)
			return;
		ImprimirDivisores(numero,divisor+1);
		if(numero%divisor==0)
			System.out.println(divisor);
	}
	
	public static boolean esPerfecto(int number) {
	    int sum = 0;
	    for (int i = 1; i <= number/2; i++) {
	        if (number % i == 0) {
	            sum += i;
	        }
	    }
	    return sum == number;
	}
	
	public bool esPerfectoRec(int numero, int divisor) {
		if(divisor == numero/2 )
			return;
		esPerfectoRec(divisor+1);
		if(numero % divisor == 0)
	}
}
