package edu.flaviomxx.estruturasexcepcionais.excecoespersonalizadas;

public class ExemploFormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep deve ter 8 caracteres");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
}
