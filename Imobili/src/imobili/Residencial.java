/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobili;

/**
 *
 * @author Aluno
 */
public class Residencial extends Imovel {
    private int numeroQuarto;

    public Residencial( int codigo, String regiao, double valor, boolean disponivel, int numeroQuarto) {
        super(codigo, regiao, valor, disponivel);
        this.numeroQuarto = numeroQuarto;
    }

  
   

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public String toString() {
        return "Residencial = {" +
                "numeroQuartos: " + numeroQuarto + 
                ", código: " + super.getCodigo() + 
                ", valor: " + super.getValor() + 
                ", regiao: " + super.getRegiao() + 
                ", disponivel: " + super.isDisponivel() + '}';
    }
    
}
