package edu.flaviomxx.estruturasexcepcionais;

import edu.flaviomxx.estruturasexcepcionais.excecoespersonalizadas.CepInvalidoException;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("A1.75"); //RuntimeException, há uma possivel excessão, mas nao te obrigamos a tratar

        try {
            valor = NumberFormat.getInstance().parse("A1.75"); //Exception, há uma possivel excessão, e queremos que trate
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
