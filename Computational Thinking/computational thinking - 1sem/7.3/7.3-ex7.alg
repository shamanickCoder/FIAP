Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação] 
// Professor(a): Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
// Seção de Declarações das variáveis 
salario, novosal: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Digite seu salário: ")
   leia(salario)
   
   se salario < 500 entao
      novosal <- salario*1.15
   senao
      se (salario >= 500) E (salario <= 1000) entao
         novosal <- salario*1.1
      senao
         novosal <- salario*1.05
      fimse
   fimse
   
   escreva("NOvo salario é: ", novosal)

Fimalgoritmo