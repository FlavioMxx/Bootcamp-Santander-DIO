package edu.flaviomxx.pilarespoo.encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSG Messenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        //msn.validarConectadoInternet(); //Imagina se todos os usuários tiverem que fazer isso de forma manual? - Esses métodos ainda existem, mas o pedrinho não precisa ver e nem saber o que/está acontecendo.
        msn.enviarMensagem();
        //msn.salvarHistoricoMensagem(); //Imagina se todos os usuários tiverem que fazer isso de forma manual?
        msn.receberMensagem();
    }
}
