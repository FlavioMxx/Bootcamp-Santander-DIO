package edu.flaviomxx.pilarespoo.abstracao;

public abstract class ServicoMensagemInstantanea { //Todas as classes que extends essa pai abstrata, firmam um contrato e DEVEM implementar todos os seus metodos abstratos
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
