package br.edu.flaviomxx.java_springboot_first_steps.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson; //= new Gson(); Isso sai do padrão dos containers

    public ViaCepResponse converter(String json) {

        return gson.fromJson(json, ViaCepResponse.class);
    }
}
