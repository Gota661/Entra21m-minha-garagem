SELECT * FROM carros;

SELECT nome,fabricante,cor FROM carros;

SELECT nome AS 'Modelo',fabricante AS 'Marca',cor AS 'Cor',quantidade_portas AS 'Quantidade de portas', FROM carros;

SELECT COUNT(*) FROM carros;


INSERT INTO carros
(id,nome,cor,fabricante,placa,chassi,quilometragem,potencia,data_compra,esta_funcionando,permitida_circulacao,quantidade_portas,quantidade_batidas,ano_fabricacao,ano_lancamento,tipo_pneu,renavam,descricao);

 VALUE  
(1, "Gol", "Azul Bebe", "VW", "ABC-2000", "2Ab578ROepaso82371", 29134741, 85, '2017-08-07', TRUE, FALSE, 4, 0, 2017, 2016, 175, 847516874, "");


#INSERIR na tabela de carros um registro
#COM somente alguns campos
INSERT INTO carros
(nome, cor, fabricante, potencia, data_compra)
VALUE
("Palio", "Rosa Choque","Fiat",65,'2013-04-09');

#LIMPAR a tabela de carros por completo
TRUNCATE carros;

INSERT INTO carros (fabricante,cor,nome)
VALUES
("VW", "Cinza", "Golf"),
("VW", "Vermelho", "Jetta"),
("VW", "Amarelo", "Saveiro"),
("VW", "Preto", "New Beetle"),
("VW", "Azul bb", "Fusca"),
("VW", "Branco", "Novo Fusca"),
("VW", "Cinza", "Up"),
("VW", "Azul calcinha", "Kombi"),
("VW", "Cobalto", "Bora"),
("VW", "Vermelho", "Passat");


SELECT id,nome,quantidade_batidas FROM carros
WHERE id > 4;

SELECT id,nome,quantidade_batidas FROM carros
WHERE id >= 4;

SELECT id,nome,quantidade_batidas FROM carros
WHERE id < 4;

SELECT id,nome,quantidade_batidas FROM carros
WHERE id <= 4;

SELECT id,nome,quantidade_batidas FROM carros
WHERE id <> 4;
