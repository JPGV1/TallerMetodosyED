package Ejercicio4;

public class ProcesoPractico4 {
	public void iniciar() {
		int[] arreglo = {5, 12, 8, 19, 3}; 
	     int maximo = encontrarMaximo(arreglo);
	     System.out.println("Valor máximo: " + maximo);}
	 
	 public static int encontrarMaximo(int[] arreglo) {
	     int maximo = arreglo[0];
	     for (int i = 1; i < arreglo.length; i++) {
	         if (arreglo[i] > maximo) {
	             maximo = arreglo[i];}
	         }
	     return maximo;
	     }
	}

