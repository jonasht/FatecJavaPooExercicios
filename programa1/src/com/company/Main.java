package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa pessoa1;
        pessoa1 = new Pessoa();

        pessoa1.nome = "joão";
        pessoa1.idade = 18;

        pessoa1.fazerAniversario();

        Pessoa pessoa2;
        pessoa2 = new Pessoa();
        pessoa2.nome = "jonas";
        pessoa2.idade = 100;
        pessoa2.fazerAniversario();

    }
}
