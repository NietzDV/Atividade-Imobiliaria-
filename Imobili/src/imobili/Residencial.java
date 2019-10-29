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
public class Residencial {
    private int numeroQuarto;

    public Residencial(int numeroQuarto) {
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
        return "Residencial{" + "numeroQuarto=" + numeroQuarto + '}';
    }
    
}
