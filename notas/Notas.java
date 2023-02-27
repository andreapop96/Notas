package Ejerciciodeclase;


import java.util.Scanner;


public class Notas {


public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int n = 0;
String c = "";
System.out.println("Introduzca el valor de una calificación: ");
n = reader.nextInt();
c= califica(n);
System.out.println(c);
reader.close();
	}
//Método para especificar la calificación en función de la nota
public static String califica(int num_nota){
	String c = "";
	if (n >= 0 && num_nota < 5)
		c = "Suspenso";
	else if (n >= 5 && num_nota  < 7)
		c = "Aprobado";
	else if (n >= 7 && num_nota  <9)
		c = "Notable";
	else if (n >= 9 && num_nota  <= 10)
		c = "Sobresaliente";
	else
		c = "El valor de la calificación introducida no es correcta";


	return c;
		}
}
