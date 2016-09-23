Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação] 
// Professor(a): Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2016
Var
// Seção de Declarações das variáveis 
codProd, codPais: inteiro
pesoKg, pesoG, precoG, imposto, precoTotal: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 escreva("Digite o código do produto (1 a 10): ")
 leia(codProd)
 escreva("Digite o peso do produto em quilos: ")
 leia(pesoKg)
 escreva("Digite o código do país (1 a 3): ")
 leia(codPais)
 
 pesoG <- pesoKg*1000
 
 se (codProd > 0) e (codProd <= 4) entao
   precoG <- 15*pesoG
   senao
     se (codProd >= 5) e (codProd <= 7) entao
       precoG <- 25*pesoG
     senao
       precoG <- 35*pesoG
     fimse
 fimse
 
 escolha codPais
   caso 1
     imposto <- 0
   caso 2
     imposto <- 0.15*precoG
   caso 3
     imposto <- 0.25*precoG
 fimescolha
 
 precoTotal <- precoG + imposto
 
 escreval ("O peso em gramas é: ", pesoG)
 escreval ("O preço total do produto é: ", precoG)
 escreval ("O valor do imposto é: ", imposto)
 escreval ("O valor do produto com o imposto é: ", precoTotal)
 
 


Fimalgoritmo