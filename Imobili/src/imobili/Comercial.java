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
public class Comercial extends Imovel{

    private double areaUtil;

    
    public Comercial( int codigo, String regiao, double valor, boolean disponivel, double areaUtil) {
        super(codigo, regiao, valor, disponivel);
        this.areaUtil = areaUtil;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    @Override
    public String toString() {
        return "Comercial = {" + 
                "areaUtil: " + areaUtil + 
                ", código: " + super.getCodigo() + 
                ", valor: " + super.getValor() + 
                ", região: " + super.getRegiao() + 
                ", disponível: " + super.isDisponivel() + '}';
    }

    
  
    
}
