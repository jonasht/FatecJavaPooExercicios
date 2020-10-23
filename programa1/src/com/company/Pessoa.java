package com.company;

public class Pessoa {
    public String nome;
    public int idade;

    public void fazerAniversario() {
        System.out.println();
        System.out.println("======================================");
        System.out.println(nome + " tem " + idade + " anos");
        idade++;
        System.out.println(" agora fez aniversario e tem " + (idade));
        System.out.println("======================================");
    }
}
