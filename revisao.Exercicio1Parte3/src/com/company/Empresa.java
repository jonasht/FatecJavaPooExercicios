package com.company;

public class Empresa {
    public int idEmpresa;
    public String razaoSocial;
    public String cnpj;

    Funcionario[] empregados = new Funcionario[3];
    int i = 0;
    public void adicionarEmpregados(Funcionario f){
        if (i > 2)
            System.out.println("nao mais espaço para funcionarios");
        else {
            empregados[i] = f;
            i++;
        }
    }

    public void mostrarEmpregados(){
        System.out.println("=====================");
        System.out.println("mostrando empregados");
        System.out.println(empregados[0].to);
        System.out.println(empregados[1]);
        System.out.println(empregados[2]);
        System.out.println("=====================");
    }

    public void contemEmpregados(Funcionario f){
        System.out.println(f);

    }


}
