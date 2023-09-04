package Ejercicio6;

public class ProcesoPractico6 {
	public void iniciar() {
	int[] arreglo1 = {1, 2, 3, 4, 5};
    int[] arreglo2 = {6, 7, 8, 9, 10};
    int[] resultado = sumarArreglos(arreglo1, arreglo2);
    
    if (resultado != null) {
        System.out.print("Resultado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    } else {
        System.out.println("Los arreglos no tienen la misma longitud.");
    }
}

public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
    if (arreglo1.length != arreglo2.length) {
        return null; 
    }
    
    int[] resultado = new int[arreglo1.length];
    for (int i = 0; i < arreglo1.length; i++) {
        resultado[i] = arreglo1[i] + arreglo2[i];
    }
    return resultado;
}
}
