package Ejerciciodeclase;


import java.util.Scanner;


public class Notas {


public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int n = 0;
String c = "";
System.out.println("Introduzca el valor de una calificación: ");
n = reader.nextInt();
c= califica.califica(n); //Llamamos al metodo.
System.out.println(c);
reader.close();
	}
}
