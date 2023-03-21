package com.clase2;

public class PilaUtils {
	public static Boolean EliminarElemento(Pila pila, int num) {
		Pila pilaAux = new Pila();
		
		if(pila.EsVacia())
			return false;
		
		int elem;
		int encontrado=0;//Encontré el numero al menos una vez
		
		do {
			elem = pila.ObtenerTope();
			if(elem!=num) {
				encontrado = 1;
				pilaAux.Apilar(elem);	
			}
			pila.Desapilar();
		}while(!pila.EsVacia());
		
		do {
			pila.Apilar(pilaAux.ObtenerTope());
			pilaAux.Desapilar();
		}while(!pilaAux.EsVacia());
		
		return encontrado==1;
	}
}
