click en editar para copiar
# patoantoniocheca
/**
*main de pato
*//


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
//**
*clase de pato
*//


package pato;
import java.util.Scanner;
	public class pato
	{
			private int cont;
			private int pasos;
	public pato(int cont,int pasos)
	{
		this.cont=cont;
		this.pasos=pasos;
	}
	public void patomueve()
	{
		this.cont=0;
		this.pasos=0;
	}
	public static void opciones(int pasos,int cont)
	{
		Scanner lector= new Scanner(System.in);
		String forma[]=new String[3];
	    forma[0]="    º=  ";
	    forma[1]=" )))   ";
	    forma[2]="(((  ";
		do{
			System.out.println("introduce 1 para que el pato ande hacie delante"+"\n 2 para que el pato retroceda"+"\n 0 para que el pato pare " );
			pasos=lector.nextInt();
			if(pasos==1 && cont>=0)
			{	
				cont--;
						System.out.print(cont);
					System.out.println(" ");
					for(int i=0;i<3;i++)
					{
						System.out.println(forma[i]);
					}		
			}	
			if(pasos==2)
			{
				cont++;
					System.out.print(cont);
				System.out.println(" ");
				for(int i=0;i<3;i++)
				{
					System.out.println(forma[i]);
				}
			}
		}while(pasos!=0);
		
		if(pasos==0)
		{	
			System.out.println("el pato dejo de andar");
			for(int i=0;i<3;i++)
			{
				System.out.println(forma[i]);
			}		
			System.out.println("Stop¡");
			System.out.println(cont);
		}
		
	}
	}
	
	
