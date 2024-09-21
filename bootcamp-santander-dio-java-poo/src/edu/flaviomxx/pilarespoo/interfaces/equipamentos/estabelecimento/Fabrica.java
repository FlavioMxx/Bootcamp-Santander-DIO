package edu.flaviomxx.pilarespoo.interfaces.equipamentos.estabelecimento;

import edu.flaviomxx.pilarespoo.interfaces.equipamentos.copiadora.Copiadora;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.impressora.Deskjet;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.impressora.Impressora;
import edu.flaviomxx.pilarespoo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //Impressora impressora = new Deskjet();
        //Impressora impressora = new Laserjet();
        //Impressora impressora = new EquipamentoMultifuncional();
        //Impressora impressora = new Impressora(); --Posso instanciar todos os seus ¨filhos¨, mas nunca a interface.

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        Impressora desk = deskjet;
        //Copiadora desk = deskjet;

        Copiadora copiadora = em;
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;

        copiadora.copiar();
        impressora.imprimir();
        digitalizadora.digitalizar();
    }
}
