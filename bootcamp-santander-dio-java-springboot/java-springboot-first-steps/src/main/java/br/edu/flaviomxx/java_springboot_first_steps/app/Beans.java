package br.edu.flaviomxx.java_springboot_first_steps.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //Me indica uma classe de configuração.
public class Beans {

    @Bean //Por não ter o código fonte aberto, criamos uma bean para conseguir injetar dependencia sem problemas.
    public Gson gson() {
        return new Gson();
    }

    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setNome("Flavio Milani");
        remetente.setEmail("noreply@email.com");

        return remetente;
    }
}
