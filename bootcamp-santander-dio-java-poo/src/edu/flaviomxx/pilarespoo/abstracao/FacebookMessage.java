package edu.flaviomxx.pilarespoo.abstracao;

public class FacebookMessage extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
