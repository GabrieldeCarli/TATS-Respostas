
import atividade02.AcharExtremos.*;
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
public class TestAcharExtremos {

    public TestAcharExtremos() {
    }
    
    Utilitario uti = new Utilitario();

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
    public void TestePrimeiraEntrada() throws Exception {

        int[] vetor = {1, 2, 3, 4, 5, 6};
        Extremos ext = uti.acharExtremos(vetor);

        assertEquals(ext.getIndiceMaior(), 5);
        assertEquals(ext.getIndiceMenor(), 0);
        assertEquals(ext.getMaior(), 6);
        assertEquals(ext.getMenor(), 1);
    }

    @Test
    public void TesteSegundaEntrada() throws Exception {
        int[] vetor = {1, 99, 3, -5, 8};
        Extremos ext = uti.acharExtremos(vetor);

        assertEquals(ext.getIndiceMaior(), 1);
        assertEquals(ext.getIndiceMenor(), 3);
        assertEquals(ext.getMaior(), 99);
        assertEquals(ext.getMenor(), -5);
    }

    @Test(expected = Exception.class)
    public void VetorVazio() throws Exception {
        int[] vetor = {};
        Extremos ext = uti.acharExtremos(vetor);
    }

    @Test(expected = Exception.class)
    public void VetorNulo() throws Exception {
        int[] vetor = null;
        Extremos ext = uti.acharExtremos(vetor);
    }

}
