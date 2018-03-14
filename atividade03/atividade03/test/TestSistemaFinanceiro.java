/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class TestSistemaFinanceiro {

    public TestSistemaFinanceiro() {
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
    public void TesteSalarioAte1000Reais() {
        SistemaFinanceiro sist = new SistemaFinanceiro();
        ArrayList<Proposta> propostas = sist.gerarPropostas(500.00, 1000.00);
        assertEquals(2, propostas.size());

        Proposta p1 = propostas.get(0);
        assertEquals(2 * 1000.00, p1.getValorTotal(), 0.00000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(2000.00 / 2, p1.getValorDaParcela(), 0.00000001);

        Proposta p2 = propostas.get(1);
        assertEquals(2 * 1000.00, p2.getValorTotal(), 0.00000001);
        assertEquals(3, p2.getNumeroDeParcelas());
        assertEquals(2000.00 / 3, p2.getValorDaParcela(), 0.00000001);
    }

    @Test

    public void TesteSalarioDe1001Ate5000Reais() {
        
        SistemaFinanceiro sist = new SistemaFinanceiro();
        ArrayList<Proposta> propostas = sist.gerarPropostas(2000.00, 1000.00);
        assertEquals(3, propostas.size());

        Proposta p1 = propostas.get(0);
        assertEquals(1.3 * 1000.00, p1.getValorTotal(), 0.00000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(1.3 * 1000.00 / 2, p1.getValorDaParcela(), 0.00000001);

        Proposta p2 = propostas.get(1);
        assertEquals(1.5 * 1000.00, p2.getValorTotal(), 0.00000001);
        assertEquals(4, p2.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.00 / 4, p2.getValorDaParcela(), 0.00000001);

        Proposta p3 = propostas.get(2);
        assertEquals(1.5 * 1000.00, p3.getValorTotal(), 0.00000001);
        assertEquals(10, p3.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.00 / 10, p3.getValorDaParcela(), 0.00000001);
    }
}
