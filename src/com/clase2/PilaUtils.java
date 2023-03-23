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
	
	public static Boolean CantidadElementosEsPar(Pila pila) {
		Pila pilaAux1 = new Pila();
		Pila pilaAux2 = new Pila();
		try {
			do {
				for(int i=0;i<2;i++) {
					pila.Desapilar();
					pila.Desapilar();
				}
			}while(!pila.EsVacia());			
		}
		catch(Exception ex) {
			return false;
		}
		return true;
	}
	
	public static void copiarPila(Pila pilaOrigen, Pila pilaDestino) throws Exception {
		if(!pilaDestino.EsVacia()) {
			throw new Exception("La pilas destino debe estar vacia");
		}
		while(!pilaOrigen.EsVacia()) {
			pilaDestino.Apilar(pilaOrigen.ObtenerTope());
			pilaOrigen.Desapilar();
		}
	}
	public static void agregarPila(Pila pilaOrigen, Pila pilaDestino) throws Exception {
		while(!pilaOrigen.EsVacia()) {
			pilaDestino.Apilar(pilaOrigen.ObtenerTope());
			pilaOrigen.Desapilar();
		}
	}
	//public static Boolean EsCapicua() {
	//	
	//}
}
