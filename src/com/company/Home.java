package com.company;

public class Home  {


    public static void main(String[] args) {
  Conifer iglaste = new Conifer("mam pień, ", " gałęzie, ", "igły");
        System.out.println(iglaste.toString());
  iglaste.rosnij();
  iglaste.opóść(iglaste.needles);

  Leafy liściaste = new Leafy("mam pień", "gałęzie", "liście");
        System.out.println(liściaste.toString());
        liściaste.rosnij();
        liściaste.opóść(liściaste.leaves);
    }



}
