package com.company;
public class Main {
    public static void main(String[] args) {

        Atleta a1 = new Atleta();
        a1.setNome("Sérgio");
        a1.setEnergia(10);
        a1.setNivel(20);

        Atleta a2 = new Atleta();
        a2.setNome("Roberto");
        a1.setEnergia(15);
        a1.setNivel(10);

        Prova p1 = new Prova();
        p1.setDificuldade(3);
        p1.setEnergiaNecessaria(4);

        Prova p2 = new Prova();
        p2.setDificuldade(5);
        p2.setEnergiaNecessaria(9);

        Prova p3 = new Prova();
        p1.setDificuldade(13);
        p1.setEnergiaNecessaria(14);

        System.out.println(p1.podeRealizar(a1));
        System.out.println(p2.podeRealizar(a2));
        System.out.println(p1.podeRealizar(a2));
        System.out.println(p3.podeRealizar(a1));

    }
}
