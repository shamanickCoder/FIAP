algoritmo "semnome"
// Função :
// Autor :
// Data : 04/04/2016
// Seção de Declarações 
var
nome: caractere
preco, sub, total: real
quant, i: inteiro
inicio
// Seção de Comandos 
para i de 1 ate 2 faca
  escreval("Produto: ")
  leia(nome)
  escreval("Preço: ")
  leia(preco)
  escreval("Quantidade: ")
  leia(quant)
  sub <- preco*quant
  escreval("Subtotal: ", sub)
  total <- total + sub
fimpara
se total > 100 entao
  total <- total*(0.9)
  escreval("Total com desconto: ", total)
senao
  escreval ("Total: ", total)
fimse
fimalgoritmo
