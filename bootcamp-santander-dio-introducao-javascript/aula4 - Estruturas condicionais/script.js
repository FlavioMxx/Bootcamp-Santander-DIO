var jogadorUm = 0;
var jogadorDois = 1;
var placar;


//IFs ternarios
jogadorUm >= 0 && jogadorDois >= 0 ? console.log("Os jogadores são válidos!") : console.log("Os jogadores não são válidos!")

//IFs 
if(jogadorUm >= 0 && jogadorDois >= 0 ) {
    if (jogadorUm > 0 && jogadorDois == 0) {
        console.log("jogadorUm marcou ponto!");
        placar = jogadorUm > jogadorDois;
    } else if(jogadorDois > 0 && jogadorUm == 0) {
        console.log("jogadorDois marcou ponto!");
        placar = jogadorUm < jogadorDois;
    } else {
        console.log("Ninguem marcou ponto!");
    }
}

//Switch case
switch(placar) {
    case jogadorUm > jogadorDois:
        console.log("jogadorUm ganhou!");
        break;
    case jogadorUm < jogadorDois:
        console.log("jogadorDois ganhou!");
        break;
    default:
        console.log("Empate");
}

//Estrutura de condicao
let array = ["valor1", "valor2", "valor3", "valor4", "valor5"];
let object = {propridadeUm: "Valor1", propridadeDois: "Valor2", propridadeTres: "Valor3"};

//  FOR
for(let indice = 0; indice < array.length; indice++) {
    console.log(indice);
}

//FOR/IN
for(let i in array) {
    console.log(i);
}

for(i in object) {
    console.log(i);
}

//FOR/OF
for(i of array) {
    console.log(i);
}

// com object
for (i of object.propridadeUm) {
    console.log(i);
}

//WHILE
var a = 0;

while(a < 10) {
    a++;
    console.log(a + " while")
}

//DO/WHILE
var aa = 0;
do {
    aa++;
    console.log(aa + " do while");
} while (aa < 10);