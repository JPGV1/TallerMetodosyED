package Ejercicio8;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ProcesoPractico8 {
	public void iniciar() {

        HashMap<String, Double> notasEstudiantes = new HashMap<>();

        while (true) {
            String[] opciones = { "Agregar estudiante y nota", "Consultar nota de estudiante", "Salir" };
            int opcionSeleccionada = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Registro de Notas de Estudiantes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcionSeleccionada) {
                case 0:
                    String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante:"));
                    notasEstudiantes.put(nombreEstudiante, nota);
                    JOptionPane.showMessageDialog(null, "Estudiante y nota registrados correctamente.");
                    break;

                case 1:
                    String nombreConsulta = JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar:");
                    Double notaConsulta = notasEstudiantes.get(nombreConsulta);
                    if (notaConsulta != null) {
                        JOptionPane.showMessageDialog(null, "Nota de " + nombreConsulta + ": " + notaConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
	}
	
}
