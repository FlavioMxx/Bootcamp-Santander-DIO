package br.edu.flaviomxx.java_springboot_first_steps;

import br.edu.flaviomxx.java_springboot_first_steps.app.ConversorJson;
import br.edu.flaviomxx.java_springboot_first_steps.app.SistemaMensagem;
import br.edu.flaviomxx.java_springboot_first_steps.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args);}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistemaMensagem) throws Exception {
		return args -> {
			sistemaMensagem.enviarConfirmacaoCadastro();
			sistemaMensagem.enviarMensagemBoasVindas();
			sistemaMensagem.enviarConfirmacaoCadastro();
		};
	}
}
