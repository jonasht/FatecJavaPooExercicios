package com.company;

import java.time.LocalDate;

public class GerenciarFuncionario {

    public int posicao = 0;
    public int TAM = 3;

    public static void main(String[] args) {


        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        //f1
        f1.idFunc = 123;
        f1.nomeFunc = "joão";
        f1.departamento = "programacao";
        f1.dataContratacao = (LocalDate.of(2018, 2, 1));
        f1.salario = 5000.50;
        f1.documento = "123.123";
        f1.estaAtivo = true;

        //f2
        f2.idFunc = 456;
        f2.nomeFunc = "felipe";
        f2.departamento = "programacao";
        f2.dataContratacao = (LocalDate.of(2019, 2, 1));
        f2.salario = 4000.50;
        f2.documento = "456.456";
        f2.estaAtivo = true;

        //f3
        f3.idFunc = 789;
        f3.nomeFunc = "angelica";
        f3.departamento = "programacao";
        f3.dataContratacao = (LocalDate.of(2019, 2, 1));
        f3.salario = 6000.50;
        f3.documento = "789.789";
        f3.estaAtivo = true;

        Empresa emp = new Empresa();
        emp.empregados = new Funcionario[3];

        emp.adicionarEmpregados(f1);
        emp.adicionarEmpregados(f2);
        emp.adicionarEmpregados(f3);

        emp.mostrarEmpregados();
        //emp.empregados[0] = f1;
        //emp.empregados[1] = f2;
        //emp.empregados[2] = f3;
        boolean t;




    }
}
