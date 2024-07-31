# 1 Simulador Bancário em Java

Este é um programa simples em Java que simula operações bancárias básicas. Ele permite ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

## Funcionalidades:

O programa exibe um menu com as seguintes opções:

| Opção | Descrição |
|-------|-----------|
| 1     | Depositar: Solicita o valor a ser depositado e atualiza o saldo. Em seguida, imprime o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}". |
| 2     | Sacar: Solicita o valor a ser sacado e verifica se há saldo suficiente. Se houver saldo, imprime "Saldo atual: {saldo com 1 casa decimal}". Caso contrário, exibe "Saldo insuficiente." |
| 3     | Consultar Saldo: Apenas exibe o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}". |
| 0     | Encerrar: Encerra o programa e imprime "Programa encerrado.". |


# 2 Verificador de Número de Conta Bancária em Java

Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. A regra é que o número da conta deve ter exatamente 8 dígitos.

## Funcionalidades:

O programa segue as seguintes regras:

| Entrada   | Saída                                           |
|-----------|-------------------------------------------------|
| 01020304  | Número de conta válido.                         |
| 1234568   | Erro: Número de conta inválido. Digite exatamente 8 dígitos. |
| 3231      | Erro: Número de conta inválido. Digite exatamente 8 dígitos. |


# 3 Verificador de Idade para Conta Bancária

Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

## Funcionalidades:

O programa segue as seguintes regras:

| Entrada | Saída                                           |
|---------|-------------------------------------------------|
| 17      | Você não está elegível para criar uma conta bancária. |
| 26      | Você está elegível para criar uma conta bancária. |
| 18      | Você está elegível para criar uma conta bancária. |

# 4 Verificação de Cheque Especial

Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

## Funcionalidades:

O programa segue as seguintes regras:

| Entrada | Saída                                           |
|---------|-------------------------------------------------|
| 1000    | Transação realizada com sucesso.                |
| 100     | Transação realizada com sucesso.                |
| 2500    | Transação realizada com sucesso utilizando o cheque especial. |
| 2750    | Transação realizada com sucesso utilizando o cheque especial. |
| 300     | Transação não realizada. Limite do cheque especial excedido. |
| 1500    | Transação não realizada. Limite do cheque especial excedido. |

# 5 Controle de Saques

Ah, parece que estamos prestes a criar um assistente bancário em Java! Vamos lá, vou te guiar nessa jornada financeira. 💰✨

## Funcionalidades:

Nosso programa terá as seguintes funcionalidades:

| Etapa | Descrição |
|-------|-----------|
| 1     | Solicitar ao usuário que informe o **limite diário de saque**. |
| 2     | Em seguida, pedir ao usuário que informe o **valor do primeiro saque**. |
| 3     | Utilizando um laço `for`, iterar sobre os saques. |
| 4     | Para cada saque, verificar se o valor ultrapassa o **limite diário**. |
| 5     | Se ultrapassar, informar que o **limite foi atingido** e encerrar o loop. |
| 6     | Se não ultrapassar, informar que o **saque foi realizado com sucesso**. |



