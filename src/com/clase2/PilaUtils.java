package com.clase2;

public class PilaUtils {
	public static Boolean EliminarElemento(Pila pila, int num) throws Exception {
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
	public static Boolean EsCapicua(Pila pila) throws Exception {
		Boolean retorno = false;
		Pila pilaAux = new Pila();
		int aux = pila.ObtenerTope();
		while(!pila.EsVacia()) {
			aux = pila.ObtenerTope();
			pila.Desapilar();
			if(!pilaAux.EsVacia() && !pila.EsVacia() && pila.ObtenerTope() == pilaAux.ObtenerTope()) {
				if(compararPilas(pila, pilaAux)) {
					retorno = true;
					break;
				}
			}
				pilaAux.Apilar(aux);
		}
		pila.Apilar(aux);
		agregarPila(pilaAux,pila);
		return retorno;
	}
	public static int compararTamanoPilas(Pila pila1, Pila pila2) throws Exception {
		int retorno = 0;
		Pila pila1Aux = new Pila();
		Pila pila2Aux = new Pila();
		
		while(!pila1.EsVacia() && !pila2.EsVacia()) {
			pila1.Desapilar();
			pila2.Desapilar();
		}
		if(pila1.EsVacia()) {
			retorno --;
			copiarPila(pila1Aux,pila1);
		}
		if(pila2.EsVacia()) {
			retorno ++;
			copiarPila(pila2Aux,pila2);
		}
		return retorno;
	}
	//del mismo tamano
	public static Boolean compararPilas(Pila pila1, Pila pila2) throws Exception {
		Pila pila1Aux = new Pila();
		Pila pila2Aux = new Pila();
		while(!pila1.EsVacia() && !pila2.EsVacia() && pila1.ObtenerTope() == pila2.ObtenerTope()) {
			pila1Aux.Apilar(pila1.ObtenerTope());
			pila2Aux.Apilar(pila2.ObtenerTope());
			pila1.Desapilar();
			pila2.Desapilar();
		}
		if(pila1.EsVacia()) {
			copiarPila(pila1Aux, pila1);
			copiarPila(pila2Aux, pila2);
			return true;
		}
		agregarPila(pila1Aux,pila1);
		agregarPila(pila2Aux,pila2);
		return false;
	}
}
