package edu.flaviomxx.pilarespoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("707070");
        jeep.ligar();

        Moto africaT = new Moto();
        africaT.setChassi("202020");
        africaT.ligar();

        Veiculo coringa = africaT;

        coringa.ligar(); //Polimorfismo, tenho varias maneiras de fazer a mesma coisa.
    }
}
