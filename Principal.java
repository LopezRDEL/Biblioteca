/**
 * importar libreria de listas
 */

import java.util.LinkedList;
public class Principal {
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        Libro libro100AnosSoledad = new Libro("Cien anos de Soledad", "Gabriel Garcia Marquez", 500);
        bibliotecaKonradLorenz.registrarLibro(libro100AnosSoledad);

    }
}
