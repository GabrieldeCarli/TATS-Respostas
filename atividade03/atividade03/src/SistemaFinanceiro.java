
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel de carli
 */
class SistemaFinanceiro {

    ArrayList<Proposta> gerarPropostas(double d, double d0) {
        
        ArrayList<Proposta> propostas = new ArrayList();
        Proposta p1 = new Proposta();
        p1.setValorTotal(2 * 1000.00);
        p1.setNumeroDeParcelas(2);
        p1.setValorDaParcela(2 * 1000.00 / 2);
        propostas.add(p1);
        
        Proposta p2 = new Proposta();
        p2.setValorTotal(2000.00);
        p2.setNumeroDeParcelas(3);
        p2.setValorDaParcela(2 * 1000.00 / 3);
        propostas.add(p2);
        
        return propostas;
    
    }
}