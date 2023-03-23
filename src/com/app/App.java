package com.app;
import com.clase2.*;

public class App {

	public static void main(String[] args) throws Exception {
		Pila pila1 = new Pila();
		pila1.Apilar(1);
		pila1.Apilar(2);
		pila1.Apilar(3);
		pila1.Apilar(2);
		pila1.Apilar(3);
		pila1.Apilar(2);
		pila1.Apilar(1);
		
		
		System.out.println(PilaUtils.EsCapicua(pila1));
		
		System.out.println("terminado");
	}

}
