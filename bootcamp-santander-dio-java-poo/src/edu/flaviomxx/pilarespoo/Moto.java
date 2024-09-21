package edu.flaviomxx.pilarespoo;

public class Moto extends Veiculo{
    //Faz parte da herança, posso definir uma classe pai para não repetir os atributos em todas as outras filhas
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
        System.out.println("Moto ligada");
    }
}
