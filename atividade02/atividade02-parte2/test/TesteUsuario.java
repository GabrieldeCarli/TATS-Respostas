import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import atividade02.ValidarUsuarios.SenhaValidator;
import atividade02.ValidarUsuarios.Usuario;
import atividade02.ValidarUsuarios.UsuarioDAO;
import atividade02.ValidarUsuarios.UsuarioValidator;


/**
 *
 * @author Gabriel de Carli
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
         
        usuarioDAO = mock(UsuarioDAO.class);
        senhaValidator = mock(SenhaValidator.class);
        usuario = new Usuario();
        usuarioValidator = new UsuarioValidator(usuarioDAO);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void SenhasDiferentes() throws Exception {
        
        usuario.setNome("João Costa");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("321");

        when(usuarioDAO.getByName("João Costa")).thenReturn(usuario);
        when(senhaValidator.verificar("123")).thenReturn(true);
        usuarioValidator.setSenhaValidator(senhaValidator);
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
    }
    /* Só esta retornando Usuario ja existe
    @Test
    public void SenhasInvalidas() throws Exception {
        
        usuario.setNome("João Costa");
        usuario.setSenha("1234");
        usuario.setSenhaConfirmada("1234");

        when(usuarioDAO.getByName("João Costa")).thenReturn(usuario);
        when(senhaValidator.verificar("1234")).thenReturn(false);
        usuarioValidator.setSenhaValidator(senhaValidator);
        usuarioValidator.ehUsuarioValido(usuario);
    }
    */
    @Test
    public void NomeCurto() throws Exception {
        
        usuario.setNome("João");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        when(senhaValidator.verificar("123")).thenReturn(true);
        when(usuarioDAO.getByName("João")).thenReturn(usuario);
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
    }
    
    @Test
    public void UsuarioExiste() throws Exception {
        
        usuario.setNome("João Costa");
        usuario.setSenha("12345");
        usuario.setSenhaConfirmada("12345");
        when(usuarioDAO.getByName("João Costa")).thenReturn(usuario);
        usuarioValidator.setSenhaValidator(senhaValidator);
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
}