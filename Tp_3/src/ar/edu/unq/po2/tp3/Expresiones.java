package ar.edu.unq.po2.tp3;

public class Expresiones {
	
	String a = "abc";
	String s = a;
	String t;
	
	public void main() {

    	System.out.println(this.uno()); //retorna 3
    	
    }
    
    public int uno() {
    	return s.length();
    }
    
    public int dos() {
    	return t.length();
    }
    
    public String tres() {
    	return 1 + a;
    }
    
    public String cuatro() {
    	return a.toUpperCase();
    }
    
    public int cinco() {
    	return "Libertad".indexOf("r");
    }
    
    public int seis() {
    	return "Universidad".lastIndexOf('i');
    }
    
    public String siete() {
    	return "Quilmes".substring(2,4);
    }
    
    public boolean ocho() {
    	return (a.length() + a).startsWith("a");

    }
    
    public boolean nueve() {
    	return s == a;
    }
    
    public boolean diez() {
    	return a.substring(1,3).equals("bc");

    }
    
    
}