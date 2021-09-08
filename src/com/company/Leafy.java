package com.company;

public class Leafy  extends Tree{
    String leaves;


    public Leafy(String turnk, String branches, String leaves) {
        super(turnk, branches);
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "Leafy{" +
                ", trunk='" + trunk + '\'' +
                ", branches='" + branches + '\'' +
                "leaves='" + leaves + '\'' +

                '}';
    }
}
