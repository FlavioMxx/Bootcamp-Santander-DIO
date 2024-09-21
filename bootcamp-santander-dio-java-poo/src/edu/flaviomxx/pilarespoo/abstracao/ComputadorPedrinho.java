package edu.flaviomxx.pilarespoo.abstracao;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessage facebookMessage = new FacebookMessage();
        System.out.println("Facebook");
        facebookMessage.enviarMensagem();
        facebookMessage.receberMensagem();

        Telegram telegram = new Telegram();
        System.out.println("Telegram");
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
