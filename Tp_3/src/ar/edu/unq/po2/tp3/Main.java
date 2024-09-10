package ar.edu.unq.po2.tp3;

public class Main {

	public static void main(String[] args) {
	
		Expresiones ex = new Expresiones();
		
		 System.out.println(ex.uno());  // 3
		 //System.out.println(ex.dos());  //Da error t es null
		 System.out.println(ex.tres()); // "1abc" tranforma el 1 en string
		 System.out.println(ex.cuatro()); // "ABC"
		 System.out.println(ex.cinco());  // 4
		 System.out.println(ex.seis());   //7
		 System.out.println(ex.siete());   //"il"
		 System.out.println(ex.ocho());   //false
		 System.out.println(ex.nueve());   //true
		 System.out.println(ex.diez());   //true
	}

}
