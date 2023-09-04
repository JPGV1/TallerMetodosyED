package Ejercicio1;
import javax.swing.JOptionPane;

public class ProcesoPractico1 {

	public void iniciar() {
	        String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo:");
	        imprimirNombre(nombre);
	    }

	    public static void imprimirNombre(String nombre) {
	    	System.out.println(nombre);
	    }
	}