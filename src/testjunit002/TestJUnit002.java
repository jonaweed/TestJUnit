
package testjunit002;

import java.util.ArrayList;
import modelos.ColeccionLibros;
import modelos.Libro;


public class TestJUnit002 {

   
    public static void main(String[] args) {
        ColeccionLibros lista = new ColeccionLibros();
        Libro libro;
        String codigo;
        
        libro = new Libro("001","hola","jona");        
        lista.Agregar(libro);
        libro = new Libro("002","hola2","jon2a");        
        lista.Agregar(libro);
        libro = new Libro("003","hola3","jona3");        
        lista.Agregar(libro);
        ListarLibro(lista.Listar());
        
        libro = new Libro("003","juanchipon","jona3");        
        lista.Modificar(libro);
        ListarLibro(lista.Listar());
        
        
        codigo= "002";   
        lista.Eliminar(codigo);           
        ListarLibro(lista.Listar());
        
    }
    
    public static void ListarLibro(ArrayList<Libro> lista){
        
        for(Libro obj:lista){
            System.out.println("Codigo : "+obj.getCodigo());
            System.out.println("Titulo : "+obj.getTitulo());
            System.out.println("Autor : "+obj.getAutor());
            System.out.println("-------------------------");
        }
    }
    
}
