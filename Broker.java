import java.util.*;

public class Broker {
    private Map<String, List<Subscriber>> topicos = new HashMap<>();

    public void inscrever(String topico, Subscriber s) {
        topicos.putIfAbsent(topico, new ArrayList<>());
        topicos.get(topico).add(s);
    }

    public void publicar(String topico, String mensagem) {
        for (Subscriber s : topicos.getOrDefault(topico, List.of())) {
            s.receberMensagem(topico, mensagem);
        }
    }
}