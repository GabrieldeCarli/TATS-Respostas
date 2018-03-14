/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade02.CadastrarTurma.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author gabriel de carli
 */
public class TestCadastrarTurma {

    public TestCadastrarTurma() {
    }

    Turma turma;
    TurmaController turmaControl;
    TurmaDAO turmaDAO;
    VerificadorDeCodigos verfCodigos;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        turma = new Turma();
        turmaDAO = mock(TurmaDAO.class);
        verfCodigos = mock(VerificadorDeCodigos.class);
        //turmaControl = TurmaController(turmaDAO);
        
         
        
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
