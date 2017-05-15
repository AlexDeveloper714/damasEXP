package Codigo;

public class MainPruebas {

    public static void main(String[] args) {
        int[] precios = {1, 7, 9, 11, 2, 3, 5, 6};
        int[] longitud = {0, 2, 3, 4, 5, 6, 7, 8};
        int ver;
        varillasSolucion encontrar = new varillasSolucion();
        ver = encontrar.encontrarPrecio(8, precios, longitud);

    }

}
