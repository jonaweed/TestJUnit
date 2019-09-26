
package modelos;

import junit.framework.Assert;
import org.junit.Test;


public class TestModificar {

    public TestModificar() {
    }
   
    @Test
    public void testModificar(){
        
        
        System.out.println("Modificar");
        Libro libro = new Libro("Lib001","Titulo2","Autor");
        ColeccionLibros instance = new ColeccionLibros();
        instance.Agregar(libro);
        boolean esperado = true;
        libro = new Libro("Lib001","Titulo3","Autor");
        boolean obtenido = instance.Modificar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
