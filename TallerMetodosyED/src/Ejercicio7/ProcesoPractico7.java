package Ejercicio7;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ProcesoPractico7 {
	public void iniciar(){
		
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("hello", "hola");
    diccionario.put("world", "mundo");
    diccionario.put("computer", "computadora");
    diccionario.put("house", "casa");
    diccionario.put("cat", "gato");
    diccionario.put("dog", "perro");
    diccionario.put("goodbye", "adi�s");
    diccionario.put("car", "coche");
    diccionario.put("book", "libro");
    diccionario.put("table", "mesa");
    diccionario.put("water", "agua");
    diccionario.put("friend", "amigo");
    diccionario.put("family", "familia");
    diccionario.put("school", "escuela");
    diccionario.put("sun", "sol");

    String palabraIngles = JOptionPane.showInputDialog("Ingrese una palabra en ingl�s:");
    
    String traduccion = diccionario.get(palabraIngles);
    if (traduccion != null) {
        JOptionPane.showMessageDialog(null, "Traducci�n al espa�ol: " + traduccion);
    } else {
        JOptionPane.showMessageDialog(null, "La palabra no se encuentra en el diccionario.");
    }
}
	}