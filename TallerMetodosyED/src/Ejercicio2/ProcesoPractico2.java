package Ejercicio2;
import javax.swing.JOptionPane;

public class ProcesoPractico2 {
	public void iniciar() {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); 
    imprimirSiEsMayorQue10(numero);
    }

public static void imprimirSiEsMayorQue10(int numero) {
    if (numero > 10) {
        System.out.println(numero);}
    }
}

