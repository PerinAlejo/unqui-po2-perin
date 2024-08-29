package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numList = new ArrayList<>();
	
	public void add(Integer num) {
		this.numList.add(num);
	}
	
	public int contarPares() {
		int cont = 0;
		for (Integer num : this.numList) {
			if(this.evaluarNum(num, 2, 0)) {
				cont += 1;
			}
		}
		return cont;
	}
	
	public int contarImpares() {
		int cont = 0;
		for (Integer num : this.numList) {
			if(this.evaluarNum(num, 2, 1)) {
				cont += 1;
			}
		}
		return cont;
	}
	
	public int contarMutiplos(int div) {
		int cont = 0;
		for (Integer num : this.numList) {
			if(this.evaluarNum(num, div, 0)) {
				cont += 1;
			}
		}
		return cont;
	}
	
	public boolean evaluarNum(Integer num, int div, int result) {
		return num % div == result;
	}
	
	
	//EJERCICIO 2

	
	public int masPares() {
		int masPares = this.numList.get(0);
		int cantPares = this.cantPares(masPares);
		for (int num : this.numList) {
			if(this.cantPares(num) > cantPares) {
				masPares = num;
			}
		}
		
		return masPares;
		
	}
	
	public int cantPares(int num) {
		int cantPares = 0;
		int nuevo = num;
		while(nuevo > 0) {
			cantPares += this.unoSi(this.evaluarNum(nuevo, 2, 0)); 
			nuevo = nuevo / 10;
		}
		
		return cantPares;
	}


	public int unoSi(boolean cond) {
		 return cond ? 1 : 0;
	}
	
	//EJERCICIO 3
	
		public int maxMultiplo(int x, int y) {
	        for (int i = 1000; i >= 0; i--) {
	            if (i % x == 0 && i % y == 0) {
	                return i; 
	            }
	        }
	        return -1; 
	    }
}



