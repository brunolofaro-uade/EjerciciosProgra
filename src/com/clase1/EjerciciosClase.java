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
	
	public static void ImprimirDivisoresRec(int numero, int divisor) {
		if(divisor > numero/2)
			return;
		ImprimirDivisoresRec(numero,divisor+1);
		if(numero%divisor==0)
			System.out.println(divisor);
	}
	
	public static Boolean EsPerfecto(int num) {
		int acum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				acum+=i;
		}
		return num == acum;
	}

	public static Boolean EsPerfectoRec(int num, int divisor, int acum) {
		if(divisor > num/2) {
			if(num==acum)
				return true;
			return false;
		}
		if(num%divisor==0)
			acum+=divisor;
		return EsPerfectoRec(num,divisor+1,acum);
	}
	
	public static double ProductoDeWallis(int iteraciones) {
		double acum=1;
		for(int i=1; i<=iteraciones; i++) {
			double factor1 = (double)(2*i)/(2*i-1);
			double factor2 = (double)(2*i)/(2*i+1);
			acum*=factor1*factor2;
		}
		return 2*acum;
	}
}
