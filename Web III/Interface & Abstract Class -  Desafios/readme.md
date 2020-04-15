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

## 3 - Fruta
Criar uma classe Fruta abstrata com:

atributo privado: cor
método: setCor
método abstrato: comer()

Crie 5 classes concretas com nome de frutas que realizem o extends da classe Fruta.

Implemente o método comer em cada uma delas, retornando o sabor conforme a fruta.

Na principal instancie as classes frutas solicite a cor para o usuário através do Scanner e imprima o toString de cada classe.



## 4 - Funcionário 
Criar uma classe abstrata chamada Funcionario contendo:

atributos privados: Nome e salario
métodos acessores para nome e salario
métodos abstratos: calcularBonificacao, reajustarSalario

Criar as seguintes classes: Diretor, Vendedor, Designer, Desenvolvedor com as seguintes regras:

Implementar o método calcularBonificacao conforme regras:

Diretor
Acrescentar 50% no valor do salario

Vendedor
Acrescentar 20% no valor do salario

Designer
Acrescentar 50% no valor do salario + um bônus de 1000

Desenvolvedor
Acrescentar 100% no valor do salario + um bônus de 3000

Após, chame o método calcularBonificacao dentro do método reajustarSalario somando a bonificação com o salário do funcionário.

Crie os "toString" para as classes correspondentes mostrando os valores.
Instancie no Principal todas as classes, receba os valores através do Scanner e imprima os toStrings respectivos.



## 5 - Banco Detalhado (Abstrato) 
Recrie o exercício do Banco da seguinte forma:

Crie a classe Conta, contendo:

atributos privados: titular, numero, agencia, saldo
métodos abstratos: sacar, depositar

Após crie as classes ContaCorrente e ContaPoupanca.

Na classe ContaCorrente:
adicionar o atributo taxa
adicionar os métodos setTaxa e gerarExtrato

Ao implementar os métodos sacar e depositar, em ambos deverá ser calculado com a taxa para movimentação. 
O método gerarExtrato deverá trazer o saldo da conta.

Já na classe ContaPoupanca:
adicionar o método gerarExtrato

O método gerarExtrato deverá trazer o saldo da conta adicionando 4% referente aos juros de investimento.