public class VentasTiendas {
    public static int contarVentasAltas(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int venta : fila) {
                if (venta > 500_000) {
                    contador++;
                }
            }
        }
        return contador;
    }
    public static double promedioVentasBajas(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int venta : fila) {
                if (venta < 100_000) {
                    suma += venta;
                    contador++;
                }
            }
        }
        return (contador > 0) ? (double) suma / contador : 0;
    }
    public static void imprimirVentasSinActividad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                System.out.println("Sin actividad en posición: [" + i + "][" + j + "]");
                }
            }
        }
    }
    public static int[] posicionMayorVenta(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    public static void main(String[] args) {
        int[][] ventas = {
            {50000, 600000, 0},
            {200000, 90000, 750000},
            {0, 1000000, 30000}
        };
        System.out.println("Ventas mayor a $500,000: " + contarVentasAltas(ventas));
        System.out.println("Promedio ventas menor a $100,000: " + promedioVentasBajas(ventas));
 
        int[] posicion = posicionMayorVenta(ventas);
        System.out.println("Mayor venta en posición: [" + posicion[0] + "][" + posicion[1] + "]");
    }
}