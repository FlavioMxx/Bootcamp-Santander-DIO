//Tipos de funcao

// Declarativa
function funcao() {
    console.log("Chamando funcao declarativa");
}
funcao();

// Expressoes de funcoes
var funcaoExpressoes = function /*Não é obrigatório nome, js atribui o nome da var*/() {
    console.log("Chamando expressao de funcao");
}
funcaoExpressoes();

//arrow function
var arrowfunction = () => {
    console.log("Chamando arrow function");
}
arrowfunction();