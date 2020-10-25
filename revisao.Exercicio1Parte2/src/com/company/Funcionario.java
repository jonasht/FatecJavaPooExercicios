package com.company;

import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;


    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public void  atualizarSalario(double aumento){
        System.out.println("salario: " + getSalario());
        System.out.println("aumento: " + aumento);
        setSalario(getSalario() + aumento);
        System.out.println("salario atualizado: " + getSalario());

    }
    public void demitirFuncionario(){
        System.out.println();


        System.out.println("funcionario sendo demetido\n..............");
        setEstaAtivo(false);
        System.out.println("o funcionario " + getNomeFunc() + " foi demetido");

    }

    public void imprimir(){
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\t\tDADOS: ");


        System.out.println("identificação: " + getIdFunc());
        System.out.println("Nome: " + getNomeFunc());
        System.out.println("departamento: " + getDepartamento());
        System.out.println("dataContratacao: " + getDataContratacao());
        System.out.println("salario: " + getSalario());
        System.out.println("documento: " + getDocumento());
        System.out.printf("esta Ativo: ");
        if(isEstaAtivo()) System.out.println("sim");
        else System.out.println("não");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
