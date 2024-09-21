package edu.flaviomxx.pilarespoo.polimorfismo;

public abstract class ServicoMensagemInstantanea { //Todas as classes que extends essa pai, terão os métodos e atribbutos pré definido aqui, apenas alterando o necessario
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
