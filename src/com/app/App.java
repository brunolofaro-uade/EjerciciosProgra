package com.app;
import com.clase2.*;

public class App {

	public static void main(String[] args) throws Exception {
		Pila pila1 = new Pila();
		pila1.Apilar(2);
		pila1.Apilar(3);
		pila1.Apilar(4);
		Pila pila2 = new Pila();
		pila2.Apilar(2);
		pila2.Apilar(3);
		pila2.Apilar(4);
		pila1.Desapilar();

		pila1.Desapilar();
		
		System.out.println(PilaUtils.compararPilas(pila1, pila2));
		
		System.out.println("terminado");
	}

}
