Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação] 
// Professor(a): Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2016
Var
// Seção de Declarações das variáveis 
salario, bonus1: real
tempo1: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o seu salário: ")
leia(salario)
escreva("Digite o seu tempo na empresa: ")
leia(tempo1)

se tempo1 >= 5 entao
   bonus1 <- 0.2*salario
senao
   bonus1 <- 0.1*salario
fimse

escreva("O bonus é: ", bonus1)

Fimalgoritmo