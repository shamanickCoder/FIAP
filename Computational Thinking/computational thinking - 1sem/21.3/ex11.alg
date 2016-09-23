algoritmo "semnome"
// Função :
// Autor :
// Data : 21/03/2016
// Seção de Declarações 
var
precoAtual, precoNovo: real
venda: inteiro
inicio
// Seção de Comandos 
escreva ("Digite o preço atual do produto: ")
leia (precoAtual)
escreva ("Digite a quantidade média de vendas: ")
leia (venda)
se (venda < 500) ou (preco < 30) entao
   precoNovo <- 1.1*precoAtual
senao
   se ((venda >= 500) e (venda < 1200)) ou ((preco >=30) e (preco < 80)) entao
      precoNovo <- 1.15*precoAtual
      senao
          precoNovo <- 0.8*precoAtual
   fimse
fimse
escreval("O preço novo é: ", precoNovo)
fimalgoritmo
