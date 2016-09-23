algoritmo "semnome"
// Função :
// Autor :
// Data : 14/03/2016
// Seção de Declarações 
var
cod :inteiro
valor, valorf :real
inicio
// Seção de Comandos 
escreva("Digite o código: ")
leia(cod)
escreva("Digite o valor do produto: ")
leia(valor)
escolha cod
        caso 1
             valorf <- valor*0.9
        caso 2
             valorf <- valor*0.95
        caso 3
             valorf <- valor
        caso 4
             valorf <- valor*1.1
        outrocaso
             escreval("Código inválido")
fimescolha
escreva("valor: ", valorf)
fimalgoritmo
