Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor(a): Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Seção de Declarações das variáveis
   codigo: inteiro
   preco: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o codigo: ")
   leia(codigo)
   escreva("Digite o preco: ")
   leia(preco)

   escolha codigo
   caso 1
      escreva("Porc SUL")
   caso 2
      escreva("Proc NORTE")
   caso 5, 6, 25 ate 30
      escreva("Proc NORDESTE")
   caso 10 ate 20
      escreva("Proc CENTRO-OESTE")
   outrocaso
      escreva("produto IMPORTADO")
   fimescolha

Fimalgoritmo