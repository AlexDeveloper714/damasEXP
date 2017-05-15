package Codigo;

public class varillasSolucion {
//Recordar que indices manejar :D
//Preguntar por si aca :P

    public int encontrarPrecio(int varilla, int[] precios, int[] largo) {
        int mayor = 0, varillaTotal = varilla, i = 0, k = 0;
        int[] total = new int[precios.length];
        for (i = 0; i < total.length; i++) {
            varilla = varillaTotal;
            if (largo[i] != 0) {
                while (varilla > 0 && varilla - largo[i] >= 0) {
                    total[i] += precios[i];
                    varilla -= largo[i];
                }
                if (varilla > 0) {
                    for (k = 0; k < precios.length; k++) {
                        if (varilla == largo[k]) {
                            total[i] += precios[k];
                            varilla -= largo[k];
                        }
                    }
                }
            } else {
                total[i] += precios[i];
                continue;
            }
        }
        mayor = encontrarMayor(total);
        return mayor;
    }

    public int encontrarMayor(int[] longitud) {
        int mayor = 0;
        for (int i = 0; i < longitud.length; i++) {
            if (mayor < longitud[i]) {
                mayor = longitud[i];
            }
            System.out.println(longitud[i]);
        }
        return mayor;
    }
}
