Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor(a): Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Seção de Declarações das variáveis
   media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o valor da sua média: ")
   leia(media)

   se media < 6 entao
      escreva("Insuficiente")
   senao
      se media < 8 entao
         escreva("Regular")
      senao
         se media < 9 entao
            escreva("Bom")
         senao
            escreva("Ótimo")
         fimse
      fimse
   fimse
Fimalgoritmo