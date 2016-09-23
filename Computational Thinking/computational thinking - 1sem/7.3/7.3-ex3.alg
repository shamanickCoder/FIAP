Algoritmo "semnome"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor(a): Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/02/2016
Var
   // Seção de Declarações das variáveis
   ps1,ps2,am1,am2,nac1,nac2:real
   media1S,media2S,mediaAnual:real

Inicio

   //ENTRADAS
   escreva("Digite a PS1:")
   leia(ps1)
   escreva("Digte a AM1:")
   leia(am1)
   escreva("Digite a NAC1:")
   leia(nac1)

   escreva("Digite a PS2:")
   leia(ps2)
   escreva("Digite a AM2:")
   leia(am2)
   escreva("Digite a NAC2:")
   leia(nac2)

   //PROCESSAMENTO
   media1S<-ps1*0.5+am1*0.3+nac1*0.2
   media2S<-ps2*0.5+am2*0.3+nac2*0.2
   mediaAnual<-(media1S+media2S)/2

   //SAÍDAS
   escreval("Média 1º Semestre:",media1S)
   escreval("Média 2º Semestre:",media2S)
   escreval("Média Anual:",mediaAnual)

   se mediaAnual >= 6 entao
      escreval("Foi aprovado")
   senao
      escreval("Exame")
   fimse

























Fimalgoritmo
