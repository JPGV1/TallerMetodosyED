package Ejercicio3;

public class ProcesoPractico3 {
	public void iniciar() {
        int numeroAleatorio = generarNumeroAleatorio();
        System.out.println("N�mero aleatorio: " + numeroAleatorio);
    }

    public static int generarNumeroAleatorio() {
        return (int) (Math.random() * 100) + 1;
    }
    }