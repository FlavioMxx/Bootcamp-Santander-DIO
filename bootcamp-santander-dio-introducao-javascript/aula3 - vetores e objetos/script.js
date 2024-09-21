//Como declarar um array
let array = ["String", 1, true]; // Pode guardar varios tipos de valores
console.log(array);

//Pode guardar outros arrays também
let arrayComArrays = ["String", 1, true, ["array1"], ["array2"], ["array3"], ["array4"]];
console.log(arrayComArrays[3]); // Acessando um valor especifico, lembrando que o primeiro valor está no indice 0

//foreach - itera com cada index do array
arrayComArrays.forEach(function(item, index){console.log(item, index)});

//push - adiciona um item no fim do array
arrayComArrays.push("novo item");
console.log(arrayComArrays);

//pop - remove o ultimo item
arrayComArrays.pop();
console.log(arrayComArrays);

//shift - remove o primeiro item
arrayComArrays.shift();
console.log(arrayComArrays);

//unshift - adiciona um item no inicio
arrayComArrays.unshift("item no inicio");
console.log(arrayComArrays);

//indexOf - retorna o indice de um item
console.log(arrayComArrays.indexOf(true));

//splice - remove ou substitui um item pelo index
arrayComArrays.splice(0, 3);
console.log(arrayComArrays);


//slice - retorna uma parte do array existente
let novoArray = arrayComArrays.slice(0, 3);
console.log(novoArray);

//Object
let object = { string: "String", number: 1, boolean: true, array: ["array1"], objectInterno: {
    objectInterno: "objectInterno"
}};

console.log(object);

//Manipulando atributos do objeto
var string = object.string;
console.log(string);

var arrayInterno = object.array;
console.log(arrayInterno);

var { string, boolean, objectInterno} = object;
console.log(string, boolean, objectInterno);