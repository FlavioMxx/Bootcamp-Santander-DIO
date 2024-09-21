package edu.flaviomxx.pilarespoo.polimorfismo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea em = null;

        String app = "TeLeGRam";

        if(app.equalsIgnoreCase("msn")) {
            em = new MSNMessenger();
        } else if(app.equalsIgnoreCase("facebook")) {
            em = new FacebookMessage();
        } else if (app.equalsIgnoreCase("telegram")) {
            em = new Telegram();

        }

        em.enviarMensagem();
        em.receberMensagem();
    }
}
