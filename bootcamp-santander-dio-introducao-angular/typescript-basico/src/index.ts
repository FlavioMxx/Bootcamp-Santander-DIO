
//Variaveis
 

    //Tipos Primitivos: boolean, number, string;
    let ligado : boolean = true; //or false.
    let nome : string = "Maria";
    let idade : number = 2024;
    let altura : number = 1.79; //Number aceita casa decimal.

    //Tipos Especiais: null or undefined
    let nulo : null = null; //Recebe apenas null.
    let indefinido : undefined = undefined; //Recebe apenas undefined.

    //Tipos Abrangentes: any or void.
    let retornoVazio : void; //Não recebe nada, apenas "nada"
    let qualquerCoisa : any = "LITERALMENTE QUALQUER COISA"; //Posso colocar um camelo aqui, que vai dar bom.


    //objeto - sem previsibilidade
    let produto : object = {
        nome: "Maria",
        cidade: "SP",
        idade: 0,
    };


    //objeto - tipado - com previsibilidade
    type ProdutoLoja = {
        nome : string; 
        preco: number;
        unidades : number;
    }

    let meuProduto : ProdutoLoja = {
        nome : "Tenis",
        preco : 89.99,
        unidades : 5,
    }

    //arrays - unitype
    let dados: string[] = ["Flavio", "Jullya", "Maria"];
    let dados2 : Array<string> = ["Flavio", "Jullya", "Maria"];

    //arrays- multitype
    let infos: (string | number)[] = ["Flavio", 13, "Jullya", 3, "Maria", 12];

    //tuplas
    let boleto: [string, number, number] = ["conta de agua", 199.90, 83502958];

    //datas
    let aniversario: Date = new Date("2024-06-12 10:00");
    console.log(aniversario.toLocaleString("BR"));

//Funcoes

    //simples
    function addNUmber(x: number, y:number) : number {
    
        return x + y;
    }

    function addHelloTo(name: string) {
        return `Hello ${name}`;
    }

    let soma: number = addNUmber(4, 7);

    console.log(addHelloTo("Maria"));

    //MultiTipos
    function callToPhone(phone: number | string) : number | string { // ou any 
        return phone;
    }


    //Async
    async function getDatabase(id:number): Promise<number | string> {
        return "Maria";
    }


//interfaces (type x interface)
    //usado muito apenas para tipar um objeto
    type robot = {
        readonly id: number | string, //somente leitura
        name: string,
    };
    //muito usado com classes
    interface robot2 {
        readonly id: number | string,
        name: string,
    }

    const bot: robot = {
        id: 1,
        name: "Atom",
    };

//Classes
    class Character {
        private name : string; //visto somente pela propria class
        protected stregth : number; //visto pela classe e subclasses
        public skill? : number; //Opcional - geral ve

        constructor(name : string, stregth : number, skill : number) {
            this.name = name;
            this.stregth = stregth;
            this.skill = skill;
        }

        attack() : void {
            console.log(`Attack with ${this.stregth} points`);
        }
    }    

    const char = new Character("Naruto", 78, 100);

    char.attack();    

    //subclasse
    class Magician extends Character {
        magicPoints : number
        constructor (name : string, stregth : number, skill : number, magicPoints : number) {
            super(name, stregth, skill);
            this.magicPoints = magicPoints;
        }
    }

    const magicChar = new Magician("Patolino", 100, 100, 100);

//Generics
    function concatArray<T>(...itens: T[]): T[] {
        return new Array().concat(...itens);
    }

    const numArray = concatArray<number[]>([1, 5], [3]);
    const stringArray = concatArray<string[]>(["Maria", "Cecila"], ["Jullya"]);

//Decorators
    function exibirNome(target: any) {
        console.log(target);
    }

    @exibirNome
    class Funcionario {

    }

    function apiVersion(version: string) {
        return (target : any) => {
            Object.assign(target.prototype, {__version : version})
        };
    };

    @apiVersion("1.10")
    class Api {};

    const api = new Api();
    //console.log(api.__version); //Realmente __version ira existir apenas quando for chamado o decorator
    

    //attribute decorator

    function minLenght(length: number) {
        return (target:any, key: string) => {
            let __value = target[key];

            const getter = () => __value;
            const setter = (value: string) => {
                if (value.length < length) {
                    throw new Error(`Tamanho menor do que ${length}`);
                } else {
                    __value = value;
                }
            }


            Object.defineProperty(target, key, {
                get: getter,
                set: setter,
            })
        }
        
    }
       

    class Api2 {
        @minLenght(3)
        name: string;

        constructor(name: string) {
            this.name = name;
        };
    };

    const api2 = new Api2("Produtos");
    console.log(api2.name);


