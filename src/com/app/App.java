package com.app;
import com.clase2.*;

public class App {

	public static void main(String[] args) {
		Pila pila = new Pila();
		pila.Apilar(2);
		pila.Apilar(3);
		pila.Apilar(4);
		
		System.out.println(PilaUtils.CantidadElementosEsPar(pila));
		
		System.out.println("terminado");
	}

}
