## 1 - Banco  

Vocês vão criar uma interface chamada Conta com os seguintes métodos:

depositar(double valor): void
sacar(double valor): void
getSaldo(): double

Criar 2 classes, sendo elas:

ContaCorrente que implementa a interface Conta
Na classe conta corrente vai ter uma taxa de operacao de R$ 0.45 centavos por operacao(depósito ou saque).

ContaPoupanca que implementa a interface Conta

Bônus: Vocês devem criar uma classe GeradorExtrato comum método chamado geradorConta, onde esse método recebe um objeto do tipo conta
e imprime o saldo atual da conta passada por parâmetro.
atributo -> saldo....

## 2 - Computador 
Criar as seguintes interfaces:

IMemoria -> métodos mostrarQuantidadeDeMemoria(): String,  mostrarMarca(): String
IProcessador -> métodos mostrarVelocidade(): String, mostrarMarca(): String, mostrarModelo(): String, mostrarGeracao(): String
IPlacaMae -> métodos mostrarTipoPlacaMae(): String, mostrarFabricante(): String, mostrarQuantidadeControladorasSata(): int, 
ativarRaid(): void, desativarRaid(): void, mostrarQuantidadeUSBs(): int
IComputador -> on(): void, off(): void, restart(): void, hibernate(): void 

Computador -> Essa classe deve conter:
atributos: marca, modelo, tipo(gamer, notebook, ultrabook, etc)
métodos acessores para os atributos
implementar todas as interfaces e seus métodos.
essa número 2 eu viajei na batata.... fhauehuafhueaufh... ideia do Thiago Silva.
Se vcs implementarem tdo que tá aí sem erros, tá ótimo
Atenção: Por mais que não possa abreviar por causa do CleanCode, vejo que qdo criamos "Interface" o pessoal coloca um "I" na frente do nome da Interface, ficando  "IMemoria" ao invés de: InterfaceMemoria