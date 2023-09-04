package Ejercicio5;

import java.util.ArrayList;

public class ProcesoPractico5 {
	public void iniciar() {
		ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(12);
        lista.add(8);
        lista.add(19);
        lista.add(3);

        int maximo = encontrarMaximoArrayList(lista);
        System.out.println("Valor máximo: " + maximo);
    }

    public static int encontrarMaximoArrayList(ArrayList<Integer> lista) {
        int maximo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maximo) {
                maximo = lista.get(i);
            }
        }
        return maximo;
    }
	}

