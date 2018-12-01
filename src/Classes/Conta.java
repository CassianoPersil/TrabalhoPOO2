/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public abstract class Conta {
    String nomeDoCliente;
    double consumo;
    double iluminacaoPublica;
    public abstract double calcularConta();
}
