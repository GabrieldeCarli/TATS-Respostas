/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.DefinirFaixaEtaria;

/**
 *
 * @author gabriel de carli
 */
public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String pNome, int pIdade) {
        nome = pNome;
        idade = pIdade;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
}
