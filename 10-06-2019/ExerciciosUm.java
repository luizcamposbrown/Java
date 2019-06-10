import java.util.HashMap;
import java.util.Map;

public class ExerciciosUm {
    public static void main(String[] args) {
        Map<Integer, String> dicionario = new HashMap<>();

        // adicionar por chave o valor
        dicionario.put(0,"ovos");
        dicionario.put(1,"aguas");
        dicionario.put(2,"escopeta");
        dicionario.put(3,"cavalo");
        dicionario.put(4,"dentista");
        dicionario.put(5,"fogo");

        // para percorrer todos os "valores" precisamos percorrer todas as "chaves"

        for(Integer chave :dicionario.keySet()){
            String valor = dicionario.get(chave);
            System.out.println(valor);
        }

    }
}
