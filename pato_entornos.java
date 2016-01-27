package pato;

import java.util.Scanner;

public class pato_entornos {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int pasitos=0;
		int c=0;
		pato patoso= new pato(pasitos,c);
		pato.opciones(pasitos,c);
	}

	


}

