//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

// Entrada de dados
let saldoTotal = parseInt(gets());
let valorSaque = parseInt(gets());

//TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.

if(valorSaque > saldoTotal) {
  console.log("Saldo insuficiente. Saque nao realizado!");
} else {
  saldoTotal -= valorSaque;
  console.log("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
}