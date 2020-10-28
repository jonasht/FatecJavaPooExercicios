package com.company;

import java.time.LocalDate;

public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean estaAtivo;

    public void  atualizarSalario(double aumento){
        System.out.println("salario: " + salario);
        System.out.println("aumento: " + aumento);
        salario += aumento;
        System.out.println("salario atualizado: " + salario);

    }
    public void demitirFuncionario(){
        System.out.println();


        System.out.println("funcionario sendo demetido\n..............");
        estaAtivo = false;
        System.out.println("o funcionario " + nomeFunc + " foi demetido");

    }

    public void imprimir(){
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\t\tDADOS: ");

        System.out.println("identificação: " + idFunc);
        System.out.println("Nome: " + nomeFunc);
        System.out.println("departamento: " + departamento);
        System.out.println("dataContratacao: " + dataContratacao);
        System.out.println("salario: " + salario);
        System.out.println("documento: " + documento);
        System.out.printf("esta Ativo: ");
        if(estaAtivo == true) System.out.println("sim");
        else System.out.println("não");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


    }
}
