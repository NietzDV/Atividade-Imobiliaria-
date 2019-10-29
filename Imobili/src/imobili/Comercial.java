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
public class Comercial {
    private double areaUtil;
    
public Comercial(double areaUtil) {
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
        return "Comercial{" + "areaUtil=" + areaUtil + '}';
    }
    
}
