//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const valor = parseFloat(gets());

if (valor > 0) {
  //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
  console.log("Deposito realizado com sucesso!\nSaldo atual: R$ " + valor.toFixed(2));
} else if (valor < 0) {
  //TODO: Imprimir a mensagem de valor inválido.
  console.log("Valor invalido! Digite um valor maior que zero.");
} else {
  console.log("Encerrando o programa...");
}