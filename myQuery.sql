CREATE TABLE palestra
	(id int NOT NULL PRIMARY KEY,
	titulo VARCHAR(120) NOT NULL,
	data_inicio TIMESTAMP(12) NOT NULL,
    apresentador VARCHAR(120) NOT NULL);