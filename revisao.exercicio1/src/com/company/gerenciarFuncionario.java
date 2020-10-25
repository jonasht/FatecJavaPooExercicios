package com.company;

import java.time.LocalDate;

public class gerenciarFuncionario {

    public static void main(String[] args) {
	// write your code here
        Funcionario func = new Funcionario();
        func.idFunc = 123;
        func.nomeFunc = "joão";
        func.departamento = "programacao";
        func.dataContratacao = (LocalDate.of(2018, 2, 1));
        func.salario = 5000.50;
        func.documento = "123.123";
        func.estaAtivo = true;


        func.atualizarSalario(100);

        func.imprimir();

        func.demitirFuncionario();
        func.imprimir();

    }
}
