
package modelos;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestAgregar.class, TestModificar.class, TestListar.class, TestEliminar.class
})
public class TestTodo {
    
}
