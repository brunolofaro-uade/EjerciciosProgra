package com.clase2;

public interface IPila {
	public void Apilar(int elem);
	public Boolean Desapilar() throws Exception;
	public Boolean EsVacia();
	public int ObtenerTope();
}
