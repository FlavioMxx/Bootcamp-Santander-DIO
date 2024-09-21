package edu.flaviomxx.metodos;

public class Metodo {
    // Criterios:
        //Deve ser nomeado como verbo.Ex: somar, abrir, chamar, deletar,...
        //Deve seguir o padrão de camelCase, tirando as iniciais da 2a frase em diante, tudo deve estar minusculo.

    void estudar() {}
    void somar(int numero1, int numero2) {}
    void abrirConexao() {}
    void concluirProcessamento() {}
    void calcularImprimir() {} //Há algo de errado neste metodo, ele calcula ou imprime? Em casos parecidos, uma boa pratica seria analisar o codigo para externalizar um metodo que calcule e um que imprime.

    //Criterios de definicao de metodos
        //Qual a proposta principal do metodo?
        //Qual o tipo de retorno esperado apos executar o metodo?
        //Quais os parametros serao necessarios para a execucao do metodo?
        //O metodo possui o risco de apresentar alguma excecao?
        //Qual a visibilidade do metodo?

    //Visibilidade - tipoRetorno - nome - parametros
            public      double     somar   (double numero1, double numero2) {
                //LOGICA - FINALIDADE DO METODO;
                return 0.0; // SEMPRE que indicar um tipo de retorno, deve obviamente RETORNAR algo do tipo definido!
            }

            public void imprimir(String texto) {
                //LOGICA - FINALIDADE DO METODO;
                //VOID significa que não existe um tipo de retorno, porém eu posso usar um return sempre que eu quiser que pule fora do metodo por algum motivo. Ex: if(texto.length() <= 0) {return;}
            }

    //throws Exception: indica que o metodo ao ser utilizado pode gerar uma excecao
    public double dividir(int dividendo, int divisor) throws Exception {return 0;}

    //Este metodo so pode ser acessado pela sua classe/objeto
    private void metodoPrivado(){}


}
