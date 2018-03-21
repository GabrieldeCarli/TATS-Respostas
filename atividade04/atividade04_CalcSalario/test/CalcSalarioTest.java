
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
    public void CalcSalarioDesenvovedor() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                5000.0, "DESENVOLVEDOR"));
        assertEquals(4000.00, calc.salFinal(), 0000.1);

    }

    @Test
    public void CalcSalarioDBA() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                2000.0, "DBA"));
        assertEquals(1500.00, calc.salFinal(), 0000.1);

    }

    @Test
    public void CalcSalarioGERENTE() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                2500.0, "GERENTE"));
        assertEquals(2000.0, calc.salFinal(), 0000.1);

    }

    @Test
    public void CalcSalarioTESTADOR() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                550.0, "TESTADOR"));
        assertEquals(467.50, calc.salFinal(), 0000.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void CalcSalarioVazio() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                550.0, ""));
        calc.salFinal();
    }
    @Test(expected = IllegalArgumentException.class)
    public void CalcSalarioInvalido() {

        CalcSalario calc = new CalcSalario(new Funcionario("Gabriel", "gabriel@gmail.com",
                -1, ""));
        calc.salFinal();
    }
}
