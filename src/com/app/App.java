package com.app;
import com.clase2.*;

public class App {

	public static void main(String[] args) {
		Pila pila = new Pila();
		System.out.println(pila.EsVacia());
		pila.Apilar(2);
		System.out.println(pila.EsVacia());
		pila.Apilar(3);
		pila.Apilar(4);
		System.out.println(pila.Desapilar());
		pila.Apilar(5);
		do {
			System.out.println(pila.ObtenerTope());
			pila.Desapilar();
		}while(!pila.EsVacia());
		System.out.println("terminado");
	}

}
