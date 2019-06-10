package modelo;

import java.util.Set;

public class Prova {
    public void somaTotal (Set<Integer> conjuntoDeinteiros){
        Integer soma = 0;
        for (Integer valor : conjuntoDeinteiros)
            soma += valor;
            System.out.println("soma " + soma);
    }
}
