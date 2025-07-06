public class AppAluno implements Subscriber {
    public void receberMensagem(String topico, String mensagem) {
        System.out.println("[Aluno] Nova mensagem: " + mensagem);
    }
}