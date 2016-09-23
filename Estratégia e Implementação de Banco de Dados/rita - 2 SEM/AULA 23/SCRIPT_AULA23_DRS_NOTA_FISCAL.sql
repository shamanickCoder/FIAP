/*exercício 1*/
SELECT DISTINCT cd_cliente, dt_emissao
FROM T_SPV_NOTA_FISCAL
ORDER BY cd_cliente, dt_emissao;

/*exercício 2*/
SELECT cd_cliente, nr_nota_fiscal, dt_emissao, vl_total_nf
FROM T_SPV_NOTA_FISCAL
WHERE cd_cliente = 3 AND dt_emissao >= TO_DATE('14/08/2014', 'DD/MM/YYYY')
ORDER BY dt_emissao;

/*exercício 3*/
SELECT nr_nota_fiscal, dt_emissao, vl_total_nf, vl_desconto
FROM T_SPV_NOTA_FISCAL
WHERE dt_emissao BETWEEN TO_DATE('15/08/2014') AND TO_DATE('31/08/2014', 'DD/MM/YYYY') AND vl_desconto IS NULL
/*vl_desconto is null porque é um campo opcional*/

/*exercício 4*/
SELECT nr_nota_fiscal, dt_emissao, ds_tipo, vl_total_nf, vl_desconto
FROM T_SPV_NOTA_FISCAL
WHERE vl_desconto is not null or DS_TIPO = '2'

/*exercício 5*/
SELECT nr_nota_fiscal AS "NR. NOTA FISCAL", 
dt_emissao "DATA EMISSAO", 
vl_total_nf "VL. TOTAL NF",
vl_desconto "% DESCONTO", 
(vl_total_nf*(vl_desconto/100)) "VALOR DO DESCONTO"
FROM T_SPV_NOTA_FISCAL
WHERE TO_CHAR(DT_EMISSAO, 'YYYY') = '2014' AND vl_total_nf > 500
ORDER BY "VALOR DO DESCONTO" DESC;

/*exercício 6*/
SELECT dt_emissao, cd_cliente, nr_nota_fiscal, vl_total_nf
FROM T_SPV_NOTA_FISCAL 
ORDER BY DT_EMISSAO DESC, CD_CLIENTE ASC, NR_NOTA_FISCAL ASC;

