/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import atividade02.parte2.*;

/**
 *
 * @author Aluno
 */
public class TesteUsuario {

    SenhaValidator senhaValidator;
    Usuario usuario;
    UsuarioDAO usuarioDAO;
    UsuarioValidator usuarioValidator;

    public TesteUsuario() {
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
    public void Teste01() throws Exception {
        usuario.setNome("Gabriel de Carli");
        usuario.setSenha("1234");
        usuario.setSenhaConfirmada("12345");
        assertEquals (, "senhas diferente");         
    }
}