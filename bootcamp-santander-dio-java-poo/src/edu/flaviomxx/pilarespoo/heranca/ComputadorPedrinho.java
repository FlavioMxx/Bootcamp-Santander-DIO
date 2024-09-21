package edu.flaviomxx.pilarespoo.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessage fcb = new FacebookMessage();
        System.out.println("FACEBOOK");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tel = new Telegram();
        System.out.println("TELEGRAM");
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
