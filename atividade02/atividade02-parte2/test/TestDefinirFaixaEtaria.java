/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade02.DefinirFaixaEtaria.Classificador;
import atividade02.DefinirFaixaEtaria.Pessoa;
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
public class TestDefinirFaixaEtaria {

    public TestDefinirFaixaEtaria() {
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

    @Test(expected = Exception.class)
    public void IdadeInvalidaMaior() {
        Pessoa p = new Pessoa("Gabriel", 111);
        Classificador classi = new Classificador();

    }

    @Test(expected = Exception.class)
    public void IdadeInvalidaMenor() {
        Pessoa p = new Pessoa("Gabriel", -1);
        Classificador classi = new Classificador();
    }

    @Test
    public void PessoaCrianca() {
        Pessoa p = new Pessoa("Gabriel", 11);
        Classificador classi = new Classificador();
        assertEquals(classi.definirFaixaEtaria(p), "Gabriel eh crianca");

    }

    @Test
    public void PessoaAdolecente() {
        Pessoa p = new Pessoa("Gabriel", 17);
        Classificador classi = new Classificador();
        assertEquals(classi.definirFaixaEtaria(p), "Gabriel eh adolescente");

    }

    @Test
    public void PessoaAdulta() {
        Pessoa p = new Pessoa("Gabriel", 23);
        Classificador classi = new Classificador();
        assertEquals(classi.definirFaixaEtaria(p), "Gabriel eh adulto");

    }

    @Test
    public void PessoaIdosa() {
        Pessoa p = new Pessoa("Gabriel", 60);
        Classificador classi = new Classificador();
        assertEquals(classi.definirFaixaEtaria(p), "Gabriel eh idoso");

    }
}
