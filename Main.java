public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Subscriber aluno = new AppAluno();
        Subscriber mae = new AppResponsavel();
        Subscriber professora = new SistemaProfessora();

        broker.inscrever("turma/8A", aluno);
        broker.inscrever("turma/8A", mae);
        broker.inscrever("turma/8A", professora);

        SistemaEscolar sistema = new SistemaEscolar(broker);
        sistema.enviarRecado();
    }
}