public class SistemaProfessora implements Subscriber {
    public void receberMensagem(String topico, String mensagem) {
        System.out.println("[Professora] Aviso enviado para turma: " + mensagem);
    }
}