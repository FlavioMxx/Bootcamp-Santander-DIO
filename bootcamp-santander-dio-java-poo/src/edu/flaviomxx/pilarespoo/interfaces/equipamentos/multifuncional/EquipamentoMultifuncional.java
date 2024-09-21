package edu.flaviomxx.pilarespoo.interfaces.equipamentos.multifuncional;

import edu.flaviomxx.pilarespoo.interfaces.equipamentos.copiadora.Copiadora;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.impressora.Impressora;


public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora { // Nao posso fazer heranca multipla, interface nos ajuda pois posso fazer implementacao multipla
    @Override
    public void copiar() {
        System.out.println("COPIANDO COM MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("IMPRIMINDO COM MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("DIGITALIZANDO COM MULTIFUNCIONAL");
    }
}
