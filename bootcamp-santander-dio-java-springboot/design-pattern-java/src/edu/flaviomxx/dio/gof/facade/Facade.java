package edu.flaviomxx.dio.gof.facade;

import edu.flaviomxx.dio.gof.externo.api.cep.ApiCep;
import edu.flaviomxx.dio.gof.externo.api.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = ApiCep.getIntance().recuperarCidade(cep);
        String estado = ApiCep.getIntance().recuperarEstado(cep);

        CrmService.gravarCliente(cep, nome, cidade, estado);
    }
}
