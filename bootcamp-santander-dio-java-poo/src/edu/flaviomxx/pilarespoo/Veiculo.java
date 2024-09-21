package edu.flaviomxx.pilarespoo;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar(); //Faz parte da abstracao, tudo o que é "igual" a mim deve implementar o meu metodo, mas cada um de sua maneira.
}
