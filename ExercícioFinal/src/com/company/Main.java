package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer x = new Integer(6) * 7; // x = 42



        //aqui estah se x não eh 42
        if (x != 42) {
            System.out.println("not 42");

        // aqui é o else if, se não eh 42 então ele vem aqui, x.igual 42
        } else if (x.equals(42)) {
            System.out.println("entrada 1");
        } else {
            System.out.println("entrada 2");
        }
    }
}
