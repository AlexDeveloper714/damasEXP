package Codigo;

public class VueltaAtras {
//Algoritmo vuelta atras con senku :D
//Dificultad: HARD
//Falta dejar la ficha en el centro 
    public String[][] crearTabDam(String[][] tabla) {
        int i = 0, j = 0;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                if (j > 1 && j < 5) {
                    tabla[i][j] = "*";
                }
                if (i > 1 && i < 5) {
                    tabla[i][j] = "*";
                }
                if (i==3 && i==j) {
                    tabla[i][j] = " ";
                }
            }

        }
        return tabla;
    }

    public String[][] borrarReina(int fila, int columna, String[][] tabla) {
        int i = 0, j = 0;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                if (fila == i) {
                    tabla[i][j] = null;
                }
                if (columna == j) {
                    tabla[i][j] = null;
                }
                if (i - j == fila - columna) {
                    tabla[i][j] = null;
                }
                if (i + j == fila + columna) {
                    tabla[i][j] = null;
                }
            }

        }
        return tabla;
    }

}
