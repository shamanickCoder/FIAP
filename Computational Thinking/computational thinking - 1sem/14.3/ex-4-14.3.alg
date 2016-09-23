Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação] 
// Professor(a): Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 14/03/2016
Var
// Seção de Declarações das variáveis 
   valor, valorf :real
   invest :caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
     escreval("TIPO DE INVESTIMENTO")
     escreval("Poupança (código A)")
     escreval("Fundo de renda fixa (código B)")
     escreval("CDB (código C)")
     escreval("Ações (código D)")
     escreva("Digite o valor do seu investimento: ")
     leia(valor)
     escreva("Escolha o código do tipo do seu investimento: ")
     leia(invest)
     escolha invest
            caso "A"
                 valorf <- valor*1.03
            caso "B"
                 valorf <- valor*1.05
            caso "C"
                 valorf <- valor*1.06
            caso "D"
                 valorf <- valor*1.1
            outrocaso
                 escreval("Código inválido.")
     fimescolha
     escreval("Valor do seu investimento: ", valorf)
Fimalgoritmo