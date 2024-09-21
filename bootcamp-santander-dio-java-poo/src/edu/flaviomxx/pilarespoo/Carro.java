package edu.flaviomxx.pilarespoo;

public class Carro extends Veiculo{ //Faz parte da herança, posso definir uma classe pai para não repetir os atributos em todas as outras filhas
    /* private String chassi;
     *
     *   public String getChassi() {
     *      return chassi;
     *   }
     *
     *   public void setChassi(String chassi) {
     *       this.chassi = chassi;
     *  }
     */

    @Override
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado.");
    }

    private void confereCombustivel() { // Posso abstrair isso para fora, antes de ligar não é necessário que ninguem saiba das conferencias. Faz parte do encapsulamento.
        System.out.println("Conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}
