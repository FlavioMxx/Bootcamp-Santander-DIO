package edu.flaviomxx.pilarespoo.polimorfismo;

public class FacebookMessage extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
