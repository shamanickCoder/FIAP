-- crie uma sequencia para a tabela categoria
-- incremento = 1
-- nome = sq_aula28_categoria

-- consulte a abela user_sequences ara visualizar
-- a estrutura da sequencia

-- dois inserts na tabela categoria (nao esquecer de
-- usar sq_aula28_categoria.nextval --> gerar o proximo
-- numero da sequencia

-- DROP SEQUENCE sq_aula28_categoria;

CREATE SEQUENCE sq_aula28_categoria
INCREMENT BY 1
START WITH 1
MAXVALUE 999
NOCACHE
NOCYCLE;

SELECT SEQUENCE_NAME,
       INCREMENT_BY,
       LAST_NUMBER
    FROM USER_SEQUENCES
    WHERE SEQUENCE_NAME = 'sq_aula28_categoria';
    
INSERT INTO T_AULA28_CATEGORIA (cd_categoria, ds_sigla_categ, ds_categoria)
 VALUES(sq_aula28_categoria.nextval, 'A', 'AAAA');
INSERT INTO T_AULA28_CATEGORIA (cd_categeoria, ds_sigla_categ, ds_categoria)
 VALUES(sq_aula28_categoria.nextval, 'B', 'BBB');
 
