
import java.util.List;


/**
 *
 * @author gabriel de carli
 */
class Controlador {
    List<Proposta> processar(Cliente c) {
        ClienteValidador.Validar(c);
        SistemaFinanceiro sis = new SistemaFinanceiro();
        return sis.gerarProposta(c);
    }
}
