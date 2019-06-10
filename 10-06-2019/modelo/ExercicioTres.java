package modelo;

import java.util.HashSet;
import java.util.Set;

public class ExercicioTres {
    public static void main(String[] args) {
        Set<Integer> conjuntoDeInteiros = new HashSet<>();
        conjuntoDeInteiros.add(5);
        conjuntoDeInteiros.add(6);

        Prova prova = new Prova();
        System.out.println(conjuntoDeInteiros);
    }
}
