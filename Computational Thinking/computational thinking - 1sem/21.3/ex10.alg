algoritmo "semnome"
// Função :
// Autor :
// Data : 21/03/2016
// Seção de Declarações 
var
opcao :inteiro
salario, imposto, novoSalario: real
inicio
// Seção de Comandos 
escreval ("Escolha uma opção do menu: ")
escreval ("1- Imposto")
escreval ("2- Novo salário")
escreval ("3- Classificação")
escreval ("4- Sair")
leia (opcao)
escolha opcao
      caso 1
           escreva ("Digite o seu salário: ")
           leia (salario)
           se salario < 1000 entao
              imposto <- 0.07*salario
           senao
              se (salario >= 1000) e (salario <= 1850) entao
                 imposto <- 0.12*salario
           senao
              imposto <- 0.15*salario
              fimse
           fimse
           escreval ("Seu imposto é: ", imposto)
      caso 2
           escreva ("Digite o seu salário: ")
           leia (salario)
           se salario < 900 entao
              novoSalario <- 1.05*salario
           senao
              se (salario >= 900) e (salario <= 1600) entao
                 novoSalario <- 1.07*salario
           senao
              se (salario > 1600) e (salario <= 2000) entao
                 novoSalario <- 1.09*salario
           senao
              novoSalario <- 1.12*salario
              fimse
              fimse
           fimse
           escreval("O seu novo salário é: ", novoSalario)
      caso 3
           escreva ("Digite o seu salário: ")
           leia (salario)
           se salario <= 1550 entao
              escreval ("Mal remunerado!")
           senao
              escreval ("Bem remunerado!")
           fimse
 fimescolha
fimalgoritmo
