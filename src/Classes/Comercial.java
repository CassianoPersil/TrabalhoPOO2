/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Cassiano Silva
 */
public class Comercial extends Conta{

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getIluminacaoPublica() {
        return iluminacaoPublica;
    }

    public void setIluminacaoPublica(double iluminacaoPublica) {
        this.iluminacaoPublica = iluminacaoPublica;
    }

    @Override
    public double calcularConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
