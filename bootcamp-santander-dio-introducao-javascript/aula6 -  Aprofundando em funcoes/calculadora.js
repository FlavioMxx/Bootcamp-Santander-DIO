function calculadora() {
    const operacao = Number(prompt("Escolha uma operacao:\n1-Soma (+)\n2-Subtracao (-)\n3-Multiplicacao (*)\n4-Divisao real (/)\n5-Divisao inteira (%)\n6-Potenciacao (**)"));

    if (!operacao || operacao < 0 || operacao > 6) {
        alert("Insira uma operacao existente:");
        calculadora();
    } else {
        let n1 = Number(prompt("Insira o primeiro valor: "));
        let n2 = Number(prompt("Insira o segundo valor: "));    

        if (!n1 || !n2) {
            alert("Insira numeros válidos:");
            calculadora();
        } else {
            function somar() {
                resultado = n1 + n2;
                alert(`${n1} + ${n2} = ${resultado}`);
                novaOperacao();
            }
        
            function subtrair() {
                resultado = n1 - n2;
                alert(`${n1} - ${n2} = ${resultado}`);
                novaOperacao();
            }
        
            function multiplicar() {
                resultado = n1 * n2;
                alert(`${n1} * ${n2} = ${resultado}`);
                novaOperacao();
            }
        
            function dividir() {
                resultado = n1 / n2;
                alert(`${n1} / ${n2} = ${resultado}`);
                novaOperacao();
            }
        
            function dividirInteiro() {
                resultado = n1 % n2;
                alert(`O resto da divisao entre ${n1} e ${n2} é ${resultado}`);
                novaOperacao();
            }
        
            function elevar() {
                resultado = n1 ** n2;
                alert(`${n1} elevado a ${n2} é ${resultado}`);
                novaOperacao();
            }
        
            function novaOperacao() {
                let opcao = prompt("Deseja fazer outra operacao?\n 1-Sim\n 2-Não");
        
                if(opcao == 1) {
                    calculadora();
                } else if (opcao == 2) {
                    alert("Ate mais...");
                } else {
                    alert("Digite uma opcao válida!");
                    novaOperacao();
                }
            }
        }

        let resultado;
    
        switch (operacao) {
        case 1:
            somar();
            break;
        case 2:
            subtrair();
            break;
        case 3: 
            multiplicar();
            break;
        case 4:
            dividir();
            break;
        case 5:
            dividirInteiro();
            break;
        case 6:
            elevar();
            break;
        }
    }
}

calculadora();