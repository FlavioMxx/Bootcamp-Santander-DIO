package edu.flaviomxx.dio.gof.externo.api.cep;

public class ApiCep {

    private static ApiCep instance = new ApiCep();

    private ApiCep() {
        super();
    }

    public static ApiCep getIntance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
