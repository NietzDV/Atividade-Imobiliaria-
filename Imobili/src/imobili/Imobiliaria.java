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

    private ArrayList<Imovel> imoveis = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int op = 1;

    public void menu() {

        do {
            System.out.println("----------Menu Imobiliária----------");
            System.out.println("1 - Cadastrar Imóvel\n2 - Alugar Imóvel\n3 - Sair");
            System.out.println("------------------------------------");
            System.out.print(">");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    //cadastrar imovel
                    cadastrarImoveis();
                    break;
                case 2:
                    //alugar imovel
                    alugarImovel();
                    break;
                case 3:
                    System.out.println("Obriago e volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (op != 3);
    }

    private boolean listaImoveis() {
        //Parte que tem que estudar
        if (imoveis.isEmpty()) {
            System.out.println("Sem imóveis cadastrados");
            return false;
        } else {
            for (Imovel i : imoveis) {
                System.out.println(i.toString());
            }
            return true;
        }
    }

    private void alugarImovel(/*int codigo //tirei por que tava bugando na chamada*/) {
        boolean flag = false;
        int alugarImovel;
        if (listaImoveis()) {
            System.out.print("Digite o codigo do imovel \n>");
            alugarImovel = sc.nextInt();
            for (Imovel i : imoveis) {
                
                if (alugarImovel == i.getCodigo()) {
                    if(i.isDisponivel()){
                    i.setDisponivel(false);
                    System.out.println("Imóvel alugado com sucesso");
                    flag = true;
                    break;
                    }
                }

            }
            if (flag == false) { //if(!flag) tambem seria melhor 
                System.out.println("Nao ha imoveis");
            }
        }

        //ultima parte faltando
    }

    private void cadastrarImoveis() {

        double valor;
        String regiao;
        int cod;

        System.out.println("----------Cadastrar Imóvel----------");
        System.out.println("1 - Residencial\n2 - Comercial");
        System.out.println("------------------------------------");

        System.out.print(">");
        op = sc.nextInt();
        System.out.print("Codigo >");
        cod = sc.nextInt();
        System.out.print("Valor >");
        valor = sc.nextDouble();
        System.out.print("Regiao >");
        regiao = sc.next();

        switch (op) {
            case 1:
                //Residencial
                System.out.print("Quantidade de quartos > ");
                imoveis.add(new Residencial(cod, regiao, valor, true, sc.nextInt()));
                break;
            case 2:
                //Comercial
                System.out.print("Área util do imóvel >");
                imoveis.add(new Comercial(cod, regiao, valor, true, sc.nextDouble()));

                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }

}
