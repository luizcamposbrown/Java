import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioDois {
    public static void main(String[] args) {
        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> joao = new ArrayList<>();
        joao.add("juan");
        joao.add("fissura");
        joao.add("maromba");

        apelidos.put("joao", joao);

        for(String nickname : apelidos.keySet()){
            System.out.println(apelidos.get(nickname));
        }

    }
}
