Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor(a): Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
   // Seção de Declarações das variáveis
   dia1, dia2, mes1, mes2, ano1, ano2, soma1, soma2: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite a primeira data: ")
   leia(dia1, mes1, ano1)
   escreva("Digite a segunda data: ")
   leia(dia2, mes2, ano2)

   soma1 <- dia1+ 30*mes1 + 365*ano1
   soma2 <- dia2+ 30*mes2 + 365*ano2

   se soma1 = soma2 entao
      escreval ("datas iguais")
   senao
      se soma1 > soma2 entao
         escreval("A data mais recente é: ")
         escreval("Dia ", dia1)
         escreval("Mês ", mes1)
         escreval("Ano ", ano1)
      senao
         escreval("A data mais recente é: ")
         escreval("Dia ", dia2)
         escreval("Mês ", mes2)
         escreval("Ano ", ano2)
      fimse
   fimse

Fimalgoritmo