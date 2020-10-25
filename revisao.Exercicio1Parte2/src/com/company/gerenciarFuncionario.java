package com.company;

import java.time.LocalDate;

public class gerenciarFuncionario {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();

        func.setIdFunc(123);
        func.setNomeFunc("joão");
        func.setDepartamento("programacao");
        func.setDataContratacao(LocalDate.of(2018, 2, 1));
        func.setSalario(5000.50);
        func.setDocumento("123.123");
        func.setEstaAtivo(true);


        func.atualizarSalario(100);

        func.imprimir();

        func.demitirFuncionario();
        func.imprimir();

    }
}
