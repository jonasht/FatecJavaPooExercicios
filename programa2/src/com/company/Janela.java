package com.company;

public class Janela {
    private boolean aberta;
    private String Cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    // modificadores de acesso
    // getters - (get) ler o dado
    // setters - (set) gravar o dado
    // <alt> + <insert> (atalho para o menu contexto) Intellij idea
    // clique em > getter and setter  > selecione todos e dee ok


    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }


    // metados aqui
    public void abre(){
        System.out.println();
        System.out.println("======================");
        System.out.println("janela abrindo");
        System.out.println(".........");
        setAberta(true);
        System.out.println("janele aberta");
        System.out.println("======================");
    }
    public void fecha(){
        System.out.println();
        System.out.println("======================");
        System.out.println("janela fechando");
        System.out.println(".........");
        setAberta(false);
        System.out.println("janele fechada");
        System.out.println("======================");


    }
    public void pinta(String s){
        setCor(s);
        System.out.println();
        System.out.println("=========================================");
        System.out.println("a janela estah pintada de " + getCor());
        System.out.println("=========================================");

    }
    public boolean estahAberta(){
        System.out.println();
        System.out.println("==================================");
        System.out.printf("a janela está ");
        if (getAberta() == true) System.out.printf("aberta");
        else System.out.printf("fechada ");
        System.out.println("\n==================================");
        System.out.println();
        return getAberta();
    }
}
