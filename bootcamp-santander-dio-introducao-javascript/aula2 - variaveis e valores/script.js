//tipos primitivos

//boolean - true ou false;
var vOuF = false;
console.log(typeof(vOuF));

//number - números;
var numero = 13;
console.log(typeof(numero));

//string - texto;
var nome = "Flavio"
console.log(typeof(nome));

//Declaracao de variavel:
//  var - escopo global e local - se iniciar vazia, null é atribuído.
//  let - escopo local de bloco - se iniciar vazia, null é atribuído.
//  const - escopo local de bloco - valor inicial obrigatório e não pode ser alterado.

var variavel = "valor";
variavel = "outro valor";
console.log(variavel);

let variavel2 = "valor qualquer";
variavel2 = "outro valor qualquer";
console.log(variavel2);

const constante = "Valor inicial e imutável";

//Escopo:
//  escopo global - quando a variável é declarada dentro de um bloco, sua visibilidade fica disponível em todo o código;
//  escopo local  - quando a variável é declarada dentro de um bloco, sua visibilidade pode ficar disponível ou não; 

var variavelGlobal = "Global";
console.log(variavelGlobal);

function escopoLocal() {
    let variavelLocal = "Local";
    console.log(variavelLocal)
}

//console.log(variavelLocal); // console.log não enxerga a variavel, me da erro.

//Atribuicao
// o sinal de = atribui um valor.

var atribuiNome = "Maria Cecilia";

//Comparacao
//  o sinal de == compara valores;
var comparaValor = "0" == 0; //true
console.log(comparaValor);

//Comparacao idêntica
// o sinal de === compara valores e tipo desses valores
var comparaValorIdentico = "0" === 0; //false
console.log(comparaValorIdentico);

//Adicao
//  o sinal de + soma valores;
var somaValor = 1 + 1; //2
console.log(somaValor);

//Subtracao
//  o sinal de - subtrai valores;
var subtraiValor = 2 - 1; //1
console.log(subtraiValor);

//Multiplicacao
//  o sinal de * multiplica valores;
var multiplicaValor = 2 * 3; //6
console.log(multiplicaValor);

//Divisao real
//  o sinal de / divide valores;
var divideValor = 6 / 2; //3
console.log(divideValor);

//Divisao inteira
//  o sinal de % divide valores e retorna o resto;
var resto = 5 % 2; //1
console.log(resto);

//Potenciacao
//  o sinal de ** eleva valores;
var elevaValor = 2**10; //1024
console.log(elevaValor);

//Maior que
//  o sinal de > retorna se o x é maior que y;
var maiorQue = 5 > 2; //true
console.log(maiorQue);

//Menor que
//  o sinal de < retorna se o x é menor que y;
var menorQue = 5 > 2; //false
console.log(menorQue);

//Maior ou igual a
//  o sinal de >= retorna se o x é maior ou igual a y;
var maiorOuIgual = 5 >= 2; //true
console.log(maiorOuIgual);

//Menor ou igual a
//  o sinal de <= retorna se o x é menor ou igual a y;
var menorOuIgual = 5 >= 2; //false
console.log(menorOuIgual);

//x E y
//  o sinal de && me retorna true caso dois valores sejam verdadeiros e false caso pelo meno um seja false;
var logicoE = true && false; //false
console.log(logicoE);

//x OU y
//  o sinal de || me retorna true caso pelo menos um seja true e falso se os dois forem falsos;
var logicoOU = true || false; //true
console.log(logicoOU);

//nao
//  o sinal de ! antes do valor me diz que não é aquilo;
var logicoNao = !true; //false
console.log(logicoNao);