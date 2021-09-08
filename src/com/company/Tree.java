package com.company;

public  abstract class Tree {
    String trunk  ;
    String branches ;


    public Tree(String turnk, String branches) {
        this.trunk = turnk;
        this.branches = branches;

    }


    void rosnij(){
        System.out.println("i rosnę");

    }
    void opóść(String neddlesOrLeaves) {
        System.out.println(" a na zimę opuszczam " + neddlesOrLeaves);
    }



}
