package Ejerciciodeclase;


import java.util.Scanner;


public class Notas {


public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int n = 0;
String c = "";
System.out.println("Introduzca el valor de una calificación: ");
n = reader.nextInt();
c= cali(n);
System.out.println(c);
reader.close();
	}
//Método para especificar la calificación en función de la nota
public static String cali(int n){
	String c = "";
	if (n >= 0 && n < 5)
		c = "Suspenso";
	else if (n >= 5 && n < 7)
		c = "Aprobado";
	else if (n >= 7 && n <9)
		c = "Notable";
	else if (n >= 9 && n <= 10)
		c = "Sobresaliente";
	else
		c = "El valor de la calificación introducida no es correcta";


	return c;
		}
}
