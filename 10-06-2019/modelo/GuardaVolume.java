package modelo;

import java.util.List;
import java.util.Map;

public class GuardaVolume {
    private dicionario = Map<Integer, List<Peca>> dicionario;
    private Integer  contador;

    public Integer guardarPecas(List<Peca> listaDePecas){
        this.dicionario.put(this.contador, listaDePecas);
        return this.contador += 1;
    }

    public void mostrarPecas (){
        for(Integer item : this.dicionario.keySet()) {
            System.out.println("item: " + item + " "+
                    "lista de pecas: " + this.dicionario.get(item) );
        }
    }

    public void devolverPecas(Integer numero){
        this.dicionario.remove(numero);
    }

}


