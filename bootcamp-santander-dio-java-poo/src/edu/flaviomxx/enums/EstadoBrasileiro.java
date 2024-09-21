package edu.flaviomxx.enums;

//Enum é um tipo especial de Classe onde os objetos são previamente criados, imutáveis e disponíveis por toda a aplicação.

/*Usamos Enumeration quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de pré-estabelecida com a certeza de não haver tanta alteração alteração de valores.

*Exemplos:
*
* GRAU DE ESCOLARIDADE: Analfabeto, Fundamental, Médio e Superior.
* ESTADO CIVIL: Solteiro, Casado, Divorciado e Viuvo.
* ESTADOS BRASILEIROS: São Paulo, Rio de Janeiro, Piauí, Maranhão, etc.
 */
public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11), //
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12), //
    PIAUI ("PI", "Piauí", 13), //
    MARANHAO ("MA", "Maranhão", 14), //
    CEARA ("CE", "Ceará", 15); //

    private String sigla; //
    private String  nome; //
    private int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
