
package libro;

import Servicio.LibroServicio;

public class Libro {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        
        Entidades.Libro l1 = ls.mostrarLibro();
        System.out.println(l1);
        
        
        
    }
    
}
