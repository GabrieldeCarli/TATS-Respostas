import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel de carli
 */

public class CalcSalarioTest {
    
    public CalcSalarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CalcSalario(){
    
        Funcionario func = new Funcionario("Gabriel", "gabriel@email.com",
                5000.0, "DESENVOLVEDOR" );
        assertEquals(4000.00, func.salFinal(), 0000.1);
        
        
    }
}
