package com.clase2;

public class Pila implements IPila {
	
	private int[] array;
	private int contador;
	
	public Pila() {
		this.array = new int[1000];
		contador=0;
	}
	
	@Override
	public void Apilar(int elem) {
		contador++;
		this.array[contador-1]=elem;
	}

	@Override
	public Boolean Desapilar() {
		if(contador==0)
			return false;
		contador--;
		return true;
	}

	@Override
	public Boolean EsVacia() {
		// TODO Auto-generated method stub
		return contador == 0;
	}

	@Override
	public int ObtenerTope() {
		//if(this.EsVacia()==false)
			//throw new Exception();
		return this.array[contador-1];
	}
}
