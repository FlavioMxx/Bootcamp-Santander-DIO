package edu.flaviomxx.controledefluxos.estruturacondicional.switchcase;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "Basic";

        switch(plano){
            case "Turbo":
                System.out.println("5GB Youtube");
            case "Midia":
                System.out.println("WhatsApp e Instagram grátis");
            case "Basic":
                System.out.println("100 minutos de ligação");
        }
    }
}
