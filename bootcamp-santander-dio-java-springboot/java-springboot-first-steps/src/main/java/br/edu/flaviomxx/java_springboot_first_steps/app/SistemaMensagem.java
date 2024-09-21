package br.edu.flaviomxx.java_springboot_first_steps.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    Remetente noreply;
    @Autowired
    Remetente financeiro;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Cadastro confirmado.");
    }

    public void enviarMensagemBoasVindas() {
        financeiro.setEmail("flavio.dev@email.com");
        System.out.println(financeiro);
        System.out.println("Seja bem-vindo!");
    }
}
