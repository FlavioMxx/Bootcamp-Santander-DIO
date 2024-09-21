package edu.flaviomxx.visibilidadedosrecursos.lanchonete.atendendimento.cozinha;

public class Cozinheiro {

    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() { //Por ser um método private, apenas o Cozinheiro tem acesso, e mais ninguem.
        System.out.println("PREPARANDO LANCHE...");
    }

    private void prepararSuco() {
        System.out.println("PREPARANDO SUCO...");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO PÃO, SALADA, HAMBURGUER E BACON");
    }

    private void selecionarIngredientesSuco() {
        System.out.println("SELECIONANDO FRUTA E PEGANDO AGUA");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO HAMBURGUER E BACON");
    }

    private void baterSucoLiquidificador() {
        System.out.println("BATENDO SUCO LIQUIDIFICADOR");
    }

   /* public void pedirTrocaGas(Atendente atendente) {
        atendente.trocarGas();                          //Por ser um método protected e Atendente não estar no mesmo pacote, Cozinheiro fica PROIBIDO de usar este método.
    }*/

    private void pedirTrocaGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();                         //Já que Cozinheiro e Almoxarife estão no mesmo pacote, consigo visualizar seu método protected/default.
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
