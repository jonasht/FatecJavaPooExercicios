package com.company;

public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    //public localdat dataContratacao;
    public double salario;
    public String documento;
    public boolean estaAtivo;

    public void  atualizarSario(double aumento){
        System.out.println("salario: " + salario);
        System.out.println("aumento: " + aumento);
        salario += aumento;
        System.out.println("salario atualizado: " + salario);

    }
    public void demitirFuncionario(){
        System.out.println();


        System.out.println("funcionario sendo demetido\n..............");
        estaAtivo = false;
        System.out.println("o funcionario foi demetido");

    }

    public void imprimir(){
        System.out.println();
        System.out.println("dados: ");
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("departamento = " + departamento);
        //System.out.println("dataContratacao = " + dataContratacao);
        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);
        System.out.println("estaAtivo = " + estaAtivo);


    }
}
