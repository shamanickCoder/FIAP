INSERT INTO T_SPV_CLIENTE 
 (cd_cliente, nm_cliente, dt_nascimento, ds_sexo, nr_cpf, nr_cpf_dig, nr_rg, nr_rg_dig, ds_email)
 VALUES (1, 'MARIA DAS DORES',TO_DATE('21/04/1987', 'DD/MM/YYYY'), 'F', 92876345, 01, 21356789, 'X', 'MARIAJOSE@MARIAJOSE.COM.BR' );
 /*Quando tenta executar a mesma linha novamente, dá erro por causa da chave primaria que não pode possuir valor igual*/
COMMIT;
SELECT * FROM T_SPV_CLIENTE; 

/*DELETE FROM T_SPV_CLIENTE
WHERE cd_cliente = 2;*/


INSERT INTO T_SPV_CLIENTE
(cd_cliente, nm_cliente, dt_nascimento, ds_sexo, nr_cpf, nr_cpf_dig, nr_rg, nr_rg_dig, ds_email)
VALUES(2, 'MARIA DE DEUS', TO_DATE('09/03/1991', 'DD/MM/YYYY'), 'M', 123456789, 01, 123456789, 'X', 'MARIADEDEUS@DEDEUS.COM.BR');
/*quando o sexo é diferente de M ou F, aparece o erro de acordo com o CHECK*/
SELECT * FROM T_SPV_CLIENTE;
COMMIT;


INSERT INTO T_SPV_CLIENTE
(cd_cliente, nm_cliente, dt_nascimento, ds_sexo, nr_cpf, nr_cpf_dig, nr_rg, nr_rg_dig, ds_email)
VALUES(3, 'JOAO DA SILVA', TO_DATE('08/09/1991', 'DD/MM/YYYY'), 'M', 12387654, 31, 98765432, 1, NULL);
SELECT * FROM T_SPV_CLIENTE;
COMMIT;


INSERT INTO T_SPV_CLIENTE
(cd_cliente, nm_cliente, dt_nascimento, ds_sexo, nr_cpf, nr_cpf_dig, nr_rg, nr_rg_dig)
VALUES(4, 'JOAO DA SILVA', TO_DATE('09/09/1991', 'DD/MM/YYYY'), 'M', 12387654, 31, 98765432, 1);
SELECT * FROM T_SPV_CLIENTE;
COMMIT;


INSERT ALL
INTO T_SPV_UNIDADE_MEDIDA
     (cd_unidade_medida, ds_sigla, ds_unidade_medida)
    VALUES(1, 'CXA', 'CAIXA')
INTO T_SPV_UNIDADE_MEDIDA
     (cd_unidade_medida, ds_sigla, ds_unidade_medida)
     VALUES(2, 'PCT', 'PACOTE')
INTO T_SPV_UNIDADE_MEDIDA
     (cd_unidade_medida, ds_sigla, ds_unidade_medida)
     VALUES(4, 'MAQ', 'MAQUINA')
INTO T_SPV_UNIDADE_MEDIDA
     (cd_unidade_medida, ds_sigla, ds_unidade_medida)
     VALUES(5, 'EQP', 'EQUIPAMENTO')    
SELECT * FROM DUAL;
COMMIT;


CREATE TABLE T_SPV_UNIDADE_MEDIDA_COPY (
 cd_unidade_medida NUMBER(2) NOT NULL,
 ds_sigla CHAR(3) NOT NULL,
 ds_unidade_medida VARCHAR2(30) NOT NULL
);
ALTER TABLE T_SPV_UNIDADE_MEDIDA_COPY
 ADD CONSTRAINT PK_SPV_UNID_MEDIDA_COPY 
 PRIMARY KEY (cd_unidade_medida);
 

INSERT INTO T_SPV_UNIDADE_MEDIDA_COPY
(CD_UNIDADE_MEDIDA, ds_sigla, ds_unidade_medida)
(SELECT cd_unidade_medida, ds_sigla, ds_unidade_medida FROM T_SPV_UNIDADE_MEDIDA);
COMMIT;
/*8A*/

CREATE TABLE T_AULA21_TESTE(
 cd_teste NUMBER(2) NOT NULL,
 ds_teste VARCHAR2(30) NOT NULL,
 dt_realizacao DATE DEFAULT SYSDATE
);
ALTER TABLE T_AULA21_TESTE
ADD CONSTRAINT PK_AULA21_TESTE
PRIMARY KEY (cd_teste);
INSERT INTO T_AULA21_TESTE
VALUES (1, 'TESTE1', NULL);
SELECT * FROM T_AULA21_TESTE;
COMMIT;
/*a inserção foi concluída. Não há nenhum valor salvo em dt_realizacao*/
/*8B*/
INSERT INTO T_AULA21_TESTE
VALUES(2, 'TESTE 2', DEFAULT);
SELECT * FROM T_AULA21_TESTE;
COMMIT;
/*a inserção foi realizada com sucesso. foi inserida a data de hoje*/
/*8C*/
INSERT INTO T_AULA21_TESTE
VALUES(3, 'TESTE 3', TO_DATE('10/08/2013', 'DD/MM/YYYY'));
SELECT * FROM T_AULA21_TESTE;
COMMIT;
/*a inserção foi realizada com sucesso. foi inserida em dt_realizacao a data digitada em values*/
/*8D*/
INSERT INTO T_AULA21_TESTE
VALUES(4, 'TESTE 4');
/*a inserção não é realizada, pois falta o campo da data*/
/*8E*/
INSERT INTO T_AULA21_TESTE
VALUES(5, 'TESTE 5', sysdate);
SELECT * FROM T_AULA21_TESTE;
COMMIT;
/*A INSERAÇÃO É REALIZADA E MOSTRA A DATA ATUAL EM DT_REALIZACAO*/
/*9*/
INSERT INTO T_SPV_PRODUTO
VALUES(1, 4, 'NOTEBOOK SENSACIONAL', 'NOTEBOOK XPTO SUPER ESPECIAL', 3, 1980.65);
INSERT ALL
 INTO T_SPV_PRODUTO
 VALUES(2, 4, 'IMPRESSOA X3', 'IMPRESSORA MULTIFUNCIONAL HP', 5, 432.89)
 INTO T_SPV_PRODUTO
 VALUES(3, 5, 'PEN DRIVE - 16GB', 'PEN DRIVE 16GB KINGSTON', 10, 60.00)
SELECT * FROM DUAL;
SELECT * FROM T_SPV_PRODUTO;
COMMIT;
/*10*/
INSERT INTO T_SPV_PRODUTO
VALUES(4, 4, 'HD EXTERNO - 500GB', 'HD EXTERNO SAMSUNG - 500GB', 10, 305.00);
/*11*/
SELECT * FROM T_SPV_PRODUTO;
UPDATE T_SPV_PRODUTO
 SET vl_preco_unitario = vl_preco_unitario*1.1
 WHERE CD_UNIDADE_MEDIDA = 1;
COMMIT;
 /*12*/
UPDATE T_SPV_PRODUTO
 SET CD_UNIDADE_MEDIDA = 5
 WHERE CD_PRODUTO = 2;
COMMIT;
/*13*/
UPDATE T_SPV_PRODUTO
 SET QT_ESTOQUE = QT_ESTOQUE + 10
 WHERE QT_ESTOQUE < 10 AND CD_UNIDADE_MEDIDA != 5;
 COMMIT;
/*14*/

