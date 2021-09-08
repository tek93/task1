package com.company;

public class Conifer extends Tree{
    String needles ;

    public Conifer(String turnk, String branches, String needles) {
        super(turnk, branches);
        this.needles = needles;
    }

    @Override
    public String toString() {
        return "Conifer{" +
                ", trunk='" + trunk + '\'' +
                ", branches='" + branches + '\'' +
                "needles='" + needles + '\'' +


                '}';
    }
}
