public class SistemaEscolar {
    private Broker broker;

    public SistemaEscolar(Broker broker) {
        this.broker = broker;
    }

    public void enviarRecado() {
        broker.publicar("turma/8A", "Prova de matemática amanhã, não esquecer a calculadora!");
    }
}