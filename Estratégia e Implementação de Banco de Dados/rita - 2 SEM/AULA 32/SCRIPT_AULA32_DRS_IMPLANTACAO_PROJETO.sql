--------------------------------------------------------
--  AULA 32 - EXEMPLOS DE SUBCONSULTAS
--------------------------------------------------------


SELECT F.NM_FUNCIONARIO, 
       F.VL_SALARIO
  FROM T_SIP_FUNCIONARIO F;

-- SUBCONSULTA - RETORNO DE UMA ÚNICA LINHA
SELECT F.NM_FUNCIONARIO,
       F.VL_SALARIO
  FROM T_SIP_FUNCIONARIO F
 WHERE F.VL_SALARIO > (
                        SELECT F.VL_SALARIO
                          FROM T_SIP_FUNCIONARIO F
                         WHERE F.NM_FUNCIONARIO = 'JOSÉ MARIA' 
                      );
                      
-- SUBCONSULTA COM FUNÇÃO DE GRUPO - RETORNO DE UMA ÚNICA LINHA
SELECT F.NM_FUNCIONARIO,
       F.VL_SALARIO
  FROM T_SIP_FUNCIONARIO F
 WHERE F.VL_SALARIO > (
                        SELECT AVG(F.VL_SALARIO)
                          FROM T_SIP_FUNCIONARIO F
                      );

-- SUBCONSULTA COM AGRUPAMENTO, FUNÇÃO DE GRUPO E HAVING
  SELECT F.CD_DEPTO,
         MIN(F.VL_SALARIO)
    FROM T_SIP_FUNCIONARIO F
GROUP BY F.CD_DEPTO
  HAVING MIN(F.VL_SALARIO) > (
                                SELECT MIN(F.VL_SALARIO)
                                  FROM T_SIP_FUNCIONARIO F
                                 WHERE F.CD_DEPTO = 3 
                             );
                             
                             
-- SUBCONSULTA NA CLÁUSULA FROM - CONSULTA INLINE
SELECT P.CD_PRODUTO, 
       P.VL_PRECO_UNITARIO, 
       QTVENDIDA.QTDEVEND
  FROM T_SPV_PRODUTO P , 
                              (
                                  SELECT I.CD_PRODUTO , COUNT (I.CD_PRODUTO) QTDEVEND
                                    FROM T_SPV_ITEM_NOTA_FISCAL I 
                                GROUP BY I.CD_PRODUTO                                  
                              ) QTVENDIDA
                              
 WHERE P.CD_PRODUTO = QTVENDIDA.CD_PRODUTO ;

-- CRIANDO UMA TABELA A PARTIR DE UM SUBCONSULTA
CREATE TABLE T_TESTE_AULA32 AS SELECT * FROM T_SPV_PRODUTO;

SELECT * FROM T_TESTE_AULA32;


-- SUBCONSULTA UTILIZANDO IN
SELECT I.CD_IMPLANTACAO ,
       I.CD_PROJETO, 
       I.NR_MATRICULA "FUNCI0NARIO"
  FROM T_SIP_IMPLANTACAO I
 WHERE I.CD_PROJETO IN
                      (
                        SELECT P.CD_PROJETO
                          FROM T_SIP_PROJETO P
                         WHERE TO_CHAR(P.DT_INICIO,'MM/YYYY') = '12/2012'
                      );
                      
-- SUBCONSULTA UTILIZANDO NOT IN
SELECT I.CD_IMPLANTACAO ,
       I.CD_PROJETO, 
       I.NR_MATRICULA "FUNCI0NARIO"
  FROM T_SIP_IMPLANTACAO I
 WHERE I.CD_PROJETO NOT IN
                      (
                        SELECT P.CD_PROJETO
                          FROM T_SIP_PROJETO P
                         WHERE TO_CHAR(P.DT_INICIO,'MM/YYYY') = '12/2012'
                      );
                      
-- SUBCONSULTA UTILIZANDO ANY

SELECT FU.NR_MATRICULA, 
       FU.NM_FUNCIONARIO, 
       FU.VL_SALARIO
  FROM T_SIP_FUNCIONARIO FU
 WHERE FU.VL_SALARIO < ANY 
                          (
                              SELECT AVG(F.VL_SALARIO)
                                FROM T_SIP_FUNCIONARIO F
                            GROUP BY F.CD_DEPTO
                          );                             
 

-- SUBCONSULTA UTILIZANDO ALL
SELECT FU.NR_MATRICULA, 
       FU.NM_FUNCIONARIO, 
       FU.VL_SALARIO
  FROM T_SIP_FUNCIONARIO FU
 WHERE FU.VL_SALARIO > ALL 
                          (
                              SELECT AVG(F.VL_SALARIO)
                                FROM T_SIP_FUNCIONARIO F
                            GROUP BY F.CD_DEPTO
                          );                             
 
 
 -- UTILIZANDO EXISTS
SELECT P.CD_PRODUTO,
       P.DS_PRODUTO
  FROM T_SPV_PRODUTO P
 WHERE EXISTS
                      (
                        SELECT I.CD_PRODUTO
                          FROM T_SPV_ITEM_NOTA_FISCAL I
                         WHERE P.CD_PRODUTO=I.CD_PRODUTO
                      );

-- UTILIZANDO NOT EXISTS                     
SELECT P.CD_PRODUTO,
       P.DS_PRODUTO
  FROM T_SPV_PRODUTO P
 WHERE NOT EXISTS
                      (
                        SELECT I.CD_PRODUTO
                          FROM T_SPV_ITEM_NOTA_FISCAL I
                         WHERE P.CD_PRODUTO=I.CD_PRODUTO
                      );


                    