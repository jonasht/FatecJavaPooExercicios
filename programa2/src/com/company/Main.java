package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code
        boolean op;
        Janela janela1 = new Janela();

        janela1.abre();
        janela1.fecha();


        janela1.pinta("vermelho");
        janela1.pinta("rosa");
        janela1.pinta("ciano");
        janela1.pinta("azul");

        janela1.setDimensaoX(10);
        janela1.setDimensaoY(15);
        janela1.setDimensaoZ(20);

        System.out.println("janela1.getDimensaoX() = " + janela1.getDimensaoX());
        System.out.println("janela1.getDimensaoY() = " + janela1.getDimensaoY());
        System.out.println("janela1.getDimensaoZ() = " + janela1.getDimensaoZ());
        
        System.out.println("janela = " + janela1.estahAberta());


    }
}
