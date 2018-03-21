/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel de carli
 */
public class CalcSalario {
    
    Funcionario func;
    String cargoVazio = "Sem Função definida";
    
    public CalcSalario(Funcionario funcionario) {
        this.func = funcionario;
    }
    public double salFinal() {
        
        
        if (func.salarioBase <= 0){
            
            throw new IllegalArgumentException("Salario Nao pode ser Negativo.");
            
        } else{
            if ("DESENVOLVEDOR".equals(func.cargo))
            {   
                if (func.salarioBase >= 3000.0){
                    return func.salarioBase * 0.8; 
                }else{
                    return func.salarioBase * 0.9; 
                }
            }
            if ("DBA".equals(func.cargo) || "TESTADOR".equals(func.cargo) )
            {   
                if (func.salarioBase >= 2000.0){
                    return func.salarioBase * 0.75; 
                }else{
                    return func.salarioBase * 0.85; 
                }
            }

            if ("GERENTE".equals(func.cargo))
            {   
                if (func.salarioBase >= 5000.0){
                    return func.salarioBase * 0.7; 
                }else{
                    return func.salarioBase * 0.8; 
                }
            }
            if ("".equals(func.cargo))
            {   
                throw new IllegalArgumentException("Nome Vazio.");
            }

            return 0;
        } 
    }
}
