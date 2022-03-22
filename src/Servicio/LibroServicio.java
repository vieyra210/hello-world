
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    public Libro mostrarLibro(){
        //generar un objeto
        Libro l1= new Libro();
        //guardar info
        Scanner sc=new Scanner(System.in); 
        System.out.println("Ingrese el ISBN del libro");
        l1.setISBN(sc.nextLine());
        System.out.println("Ingrese el título del libro");
        l1.setTitulo(sc.nextLine());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(sc.nextLine());
        System.out.println("Ingrese el número de páginas");
        l1.setPaginas(sc.nextInt());
        
        return l1;
    }


}
