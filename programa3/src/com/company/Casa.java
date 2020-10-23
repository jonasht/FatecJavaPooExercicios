package com.company;

public class Casa {
    public String cor;
    public boolean janela1, janela2, janela3;

    void pintar(String s) {
        cor = s;
        System.out.println("a casa está pintade de " + cor);
    }
    public int quatindadeDeJanelasAbertas(){
        int qtd = ((janela1) ? 1 : 0)+((janela2) ? 1 : 0)+((janela3) ? 1 : 0);
        return qtd;
    }
}
