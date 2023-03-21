package com.app;
import com.clase2.*;

public class App {

	public static void main(String[] args) {
		Pila pila = new Pila();
		pila.Apilar(2);
		pila.Apilar(3);
		pila.Apilar(4);
		pila.Apilar(5);
		pila.Apilar(3);
		pila.Apilar(3);
		pila.Apilar(6);
		pila.Apilar(3);
		pila.Apilar(7);
		pila.Apilar(3);
		
		PilaUtils.EliminarElemento(pila,3);
		
		do {
			System.out.println(pila.ObtenerTope());
			pila.Desapilar();
		}while(!pila.EsVacia());
		
		System.out.println("terminado");
	}

}
