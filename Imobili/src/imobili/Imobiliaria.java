/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobili;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Imobiliaria {
    
    private ArrayList <Imovel> imoveis;
    private Scanner sc = new Scanner(System.in);
    private int op = 1;
    public void menu(){
       
        System.out.println("----------Menu Imobiliária----------");
        System.out.println("1 - Cadastrar Imóvel\n2 - Alugar Imóvel\n3 - Sair");
        System.out.println("------------------------------------");
        do{
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    //cadastrar imovel
                   cadastrarImoveis();
                    break;
                case 2:
                    //alugar imovel
                    break;
                case 3:
                    System.out.println("Obriago e volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(op != 0);
    }
    
    private boolean listaImoveis(){
       return true; // mudar
    }
    
    private void alugarImovel(int codigo){
        
    }
    
    private void cadastrarImoveis(){
 
        System.out.println("----------Cadastrar Imóvel----------");
        System.out.println("1 - Residencial\n2 - Comercial");
        System.out.println("------------------------------------");
        do{
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    //Residencial
                    break;
                case 2:
                    //Comercial
                    break;                
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(op != 0);
    }
    
}
