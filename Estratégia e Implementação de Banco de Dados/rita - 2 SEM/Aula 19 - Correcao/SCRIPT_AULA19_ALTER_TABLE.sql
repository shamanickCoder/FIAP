----------------------------------------------------------------
-- SCRIPT COM A CORREÇÃO DOS EXERCÍCIOS PROPOSTOS NA AULA 19. --
----------------------------------------------------------------

---------------------------------------------------------------------------------------------------
-- 2.) Na tabela “CATEGORIA”, altere o nome da coluna “ds_sigla_categ” para “ds_sigla_categoria” .
---------------------------------------------------------------------------------------------------

ALTER TABLE T_AULA19_CATEGORIA
  RENAME COLUMN  ds_sigla_categ TO ds_sigla_categoria;

----------------------------------------------------------------------------------------------------------------------------------
-- 3.) Na tabela “CATEGORIA”, altere o nome da UNIQUE constraint “UN_AULA19_CATEGORIA_CATEGORIA” para “UN_AULA19_CATEGORIA_CATEG” .
----------------------------------------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_CATEGORIA
  RENAME CONSTRAINT  UN_AULA19_CATEGORIA_CATEGORIA TO UN_AULA19_CATEGORIA_CATEG; 

-- MOSTRA A ESTRUTURA DE UMA TABELA. UTILIZE DESC OU DESCRIBE.
DESCRIBE T_AULA19_CATEGORIA;
DESC T_AULA19_CATEGORIA;

-- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_CATEGORIA');

---------------------------------------------------------------------------------------------------
-- 4.) Na tabela “AUTOR”, altere o tamanho da coluna “nm_nome_completo” para 60 caracteres.
---------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_AUTOR
  MODIFY nm_nome_completo VARCHAR2(60);
  
---------------------------------------------------------------------------------------------------
-- 5.) Na tabela “AUTOR”, altere o tamanho da coluna “ds_email” para 40 caracteres e 
--     elimine a constraint NOT NULL da coluna “ds_email”.

---------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_AUTOR
  MODIFY ds_email VARCHAR2(40) NULL;

-- MOSTRA A ESTRUTURA DA TABELA
DESC T_AULA19_AUTOR;  

---------------------------------------------------------------------------------------------------
-- 6.) Na tabela “LIVRO", altere o tamanho da coluna “nr_isbn” para 13 digitos.
---------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_LIVRO
  MODIFY nr_isbn NUMBER(13);

-- MOSTRA A ESTRUTURA DA TABELA
DESC T_AULA19_LIVRO;    

---------------------------------------------------------------------------------------------------
-- 7.) Na tabela “AUTOR_LIVRO", altere o tamanho da coluna “nr_isbn” para 13 digitos.
---------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_AUTOR_LIVRO
  MODIFY nr_isbn NUMBER(13);

-- MOSTRA A ESTRUTURA DA TABELA
DESC T_AULA19_AUTOR_LIVRO;  

--------------------------------------------------------------------------------------------------------
-- 8.) Na tabela “AUTOR”, insira a coluna “nm_pais_origem” (nome do país de origem do autor) VARCHAR2(30),
--    não obrigatório.
---------------------------------------------------------------------------------------------------------
ALTER TABLE T_AULA19_AUTOR
  ADD nm_pais_origem VARCHAR2(30) NULL;

-- MOSTRA A ESTRUTURA DA TABELA
DESC T_AULA19_AUTOR;   
------------------------------------------------------------------------------
-- 9.) Na tabela “LIVRO”, insira a UNIQUE constraint para a coluna “nm_titulo”. 
-- Nome da constraint: “UN_AULA19_LIVRO_TITULO”.
------------------------------------------------------------------------------
ALTER TABLE T_AULA19_LIVRO
  ADD CONSTRAINT UN_AULA19_LIVRO_TITULO
  UNIQUE (nm_titulo);

-- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_LIVRO');

------------------------------------------------------------------------------
-- 10.) Na tabela “AUTOR_LIVRO” elimine a constraint “FK_AULA19_LIVRO_AUTOR”.
------------------------------------------------------------------------------
ALTER TABLE T_AULA19_AUTOR_LIVRO DROP CONSTRAINT FK_AULA19_LIVRO_AUTOR;

-- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_AUTOR_LIVRO');

-------------------------------------------------------------------------------------  
-- 11.) Na tabela “AUTOR” elimine a constraint “PK_AULA19_AUTOR”, com a opção CASCADE.
-------------------------------------------------------------------------------------  
ALTER TABLE T_AULA19_AUTOR DROP CONSTRAINT PK_AULA19_AUTOR CASCADE;

-- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_AUTOR');
  
  -- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_AUTOR_LIVRO');
  
----------------------------------------------------------------------------------------------------   
-- 12.) Na tabela “AUTOR” desabilite a UNIQUE "UN_AULA19_AUTOR_EMAIL" constraint do campo “ds_email”.
----------------------------------------------------------------------------------------------------  
ALTER TABLE T_AULA19_AUTOR DISABLE CONSTRAINT UN_AULA19_AUTOR_EMAIL;

-- VISUALIZAR CONSTRAINTS DE UMA TABELA
SELECT TABLE_NAME, CONSTRAINT_NAME,
       CONSTRAINT_TYPE, SEARCH_CONDITION, STATUS
	FROM ALL_CONSTRAINTS
	WHERE TABLE_NAME = UPPER('T_AULA19_AUTOR');

  