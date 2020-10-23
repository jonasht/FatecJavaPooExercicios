package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Casa casa = new Casa();

        casa.pintar("azul");
        casa.janela1 = true;
        casa.janela2 = true;
        casa.janela3 = false;

        System.out.println("quantidade de janela.s aberta.s " + casa.quatindadeDeJanelasAbertas());
    }
}
