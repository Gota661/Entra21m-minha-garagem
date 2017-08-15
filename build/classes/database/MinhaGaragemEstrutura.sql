#APAGAR  o banco de dados
DROP DATABASE IF EXISTS minha_garagem;

#CRIAR o banco de dados
CREATE DATABASE IF NOT EXISTS minha_garagem;

#SELECIONA o banco de dados
USE minha_garagem;

#DELETA a tabela se ela existir
DROP TABLE IF EXISTS carros;

#CRIAR
CREATE TABLE IF NOT EXISTS Carros (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(255),
    placa VARCHAR(8),
    chassi VARCHAR(50),
    quilometragem FLOAT,
    potencia FLOAT,
    data_compra DATE,
    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,
    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,
    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,
    renavam INT,
    
    descricao TEXT
);
