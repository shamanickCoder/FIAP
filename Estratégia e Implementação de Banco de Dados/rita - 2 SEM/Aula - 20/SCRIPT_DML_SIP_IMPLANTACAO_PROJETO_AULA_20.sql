---------------------------------------------------------
-- SCRIPT DML - ESTUDO DE CASO: IMPLANTACAO DE PROJETOS
---------------------------------------------------------

-- INSERINDO DADOS NA TABELA DEPARTAMENTO
INSERT INTO T_SIP_DEPARTAMENTO  VALUES (1,'FINANCEIRO');
INSERT INTO T_SIP_DEPARTAMENTO (cd_depto, nm_depto) VALUES (2,'MARKETING');
INSERT INTO T_SIP_DEPARTAMENTO (cd_depto, nm_depto) VALUES (3,'RECURSOS HUMANOS');
INSERT INTO T_SIP_DEPARTAMENTO (cd_depto, nm_depto) VALUES (4,'COMERCIAL');
-- EFETIVANDO AS TRANSAÇÕES DE INSERÇÃO NA TABELA
COMMIT;
-- CONSULTANDO A TABELA
SELECT * FROM T_SIP_DEPARTAMENTO;  


-- Criando uma tabela adicional para testar o comando INSERT
-- copiando linhas de uma tabela para  outra
CREATE TABLE T_SIP_DEPTO_TEMP 
    ( 
     cd_depto NUMBER (3)  NOT NULL , 
     nm_depto VARCHAR2 (30)  NOT NULL 
    ) 
;

ALTER TABLE T_SIP_DEPTO_TEMP 
    ADD CONSTRAINT PK_SIP_DEPTO_TEMP PRIMARY KEY ( cd_depto ) ;
    
-- Com subquery
INSERT INTO T_SIP_DEPTO_TEMP (cd_depto, nm_depto) 
 (SELECT cd_depto, nm_depto FROM T_SIP_DEPARTAMENTO);
-- outras formas de escrever, desde que as colunas a serem copiadas sejam
-- equivalentes em tipo de dados e tamanho
-- é necessario que os campos estejam na mesma ordem
INSERT INTO T_SIP_DEPTO_TEMP  
 (SELECT cd_depto, nm_depto FROM T_SIP_DEPARTAMENTO);
 
INSERT INTO T_SIP_DEPTO_TEMP 
 (SELECT * FROM T_SIP_DEPARTAMENTO); 

INSERT INTO T_SIP_DEPTO_TEMP (cd_depto, nm_depto) 
 (SELECT * FROM T_SIP_DEPARTAMENTO); 

-- ERRO! veja a situação de erro
INSERT INTO T_SIP_DEPTO_TEMP (nm_depto,cd_depto) 
 (SELECT * FROM T_SIP_DEPTO_TEMP); 
 
COMMIT; 
SELECT * FROM T_SIP_DEPTO_TEMP; 

INSERT ALL
  INTO T_SIP_DEPTO_TEMP (cd_depto, nm_depto)  VALUES (5,'TESTE 5')
  INTO T_SIP_DEPTO_TEMP (cd_depto, nm_depto)  VALUES (6,'TESTE 6')
  INTO T_SIP_DEPTO_TEMP (cd_depto, nm_depto)  VALUES (7,'TESTE 7')
SELECT * FROM DUAL;  
COMMIT;
SELECT * FROM T_SIP_DEPTO_TEMP;

--DELETE FROM T_SIP_DEPARTAMENTO_TEMP;

-- EXEMPLOS DE CONSULTA NA DUAL
desc DUAL;
SELECT * FROM DUAL;
SELECT SYSDATE FROM DUAL;
SELECT USER FROM   DUAL;
SELECT 1 cd, 'TESTE' cidade FROM DUAL;


-- Inserindo DATA e números DECIMAIS
INSERT INTO T_SIP_FUNCIONARIO
	(nr_matricula,cd_depto,nm_funcionario,
 	dt_nascimento,dt_admissao,ds_endereco,vl_salario) 
VALUES (1234,1,'ANA MARIA', 
        TO_DATE('10/02/1986','DD/MM/YYYY'),
        TO_DATE('09/08/2010','DD/MM/YYYY'),
        'R. DARIO PEREIRA, 23',TO_NUMBER('1234,56')); 

-- Inserindo com valores nulos
INSERT INTO T_SIP_FUNCIONARIO
	(nr_matricula,cd_depto,nm_funcionario,
 	dt_nascimento,dt_admissao,ds_endereco,vl_salario) 
VALUES (1235,1,'JOANA', NULL,
        TO_DATE('19/03/2012','DD/MM/YYYY'),
        'R. DARIO PEREIRA, 23',TO_NUMBER('1098,00')); 

-- Inserindo omitindo colunas não obrigatórias        
INSERT INTO T_SIP_FUNCIONARIO
	(nr_matricula,cd_depto,nm_funcionario,dt_admissao,
	ds_endereco,vl_salario) 
VALUES (1235,1,'JOANA', TO_DATE('19/03/2012','DD/MM/YYYY'),
        'R. DARIO PEREIRA, 23',TO_NUMBER('1098,00'));         
        
commit;

SELECT * FROM T_SIP_FUNCIONARIO;


-- EXEMPLO DE ATUALIZAÇÃO
UPDATE T_SIP_DEPTO_TEMP
   SET NM_DEPTO='TESTANDO ATUALIZACAO'
WHERE CD_DEPTO=5;

-- Com Subquery
UPDATE T_SIP_DEPTO_TEMP
 SET NM_DEPTO=
   (SELECT NM_DEPTO FROM T_SIP_DEPARTAMENTO WHERE CD_DEPTO=1)
WHERE CD_DEPTO=6;

COMMIT;

SELECT * FROM T_SIP_DEPTO_TEMP;

-- EXEMPLOS DELEÇÃO
DELETE FROM T_SIP_DEPTO_TEMP
 WHERE CD_DEPTO = 3;
COMMIT;

DELETE FROM	T_SIP_DEPTO_TEMP
		 WHERE	CD_DEPTO IN 
       (SELECT CD_DEPTO FROM T_SIP_DEPARTAMENTO);


SELECT * FROM T_SIP_DEPTO_TEMP;


-- AUMENTO DE SALARIO
UPDATE T_SIP_FUNCIONARIO
 SET VL_SALARIO = VL_SALARIO * 1.15;
 
COMMIT;

SELECT * FROM T_SIP_FUNCIONARIO;