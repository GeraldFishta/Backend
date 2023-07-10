



CREATE TABLE IF NOT EXISTS clienti (
    numero_cliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL, 
	cognome VARCHAR NOT NULL,
	data_nascita DATE NOT NULL,
	regione_residenza VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS fornitori (
	numero_fornitori SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regione_residenza VARCHAR NOT NULL

);

CREATE TABLE IF NOT EXISTS fatture (
	numero_fattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo DECIMAL NOT NULL,
	iva VARCHAR NOT NULL DEFAULT '20%',
	id_cliente INTEGER NOT NULL,
	data_fattura DATE NOT NULL,
	numero_fornitori INTEGER NOT NULL,
	CONSTRAINT fatture_clienti_fk FOREIGN KEY (id_cliente) REFERENCES clienti (numero_cliente),
	CONSTRAINT fatture_fornitori_fk FOREIGN KEY (numero_fornitori) REFERENCES fornitori (numero_fornitori)
);


CREATE TABLE IF NOT EXISTS prodotti (
	id_prodotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL, 
	in_produzione BOOLEAN NOT NULL DEFAULT 'FALSE',
	in_commercio BOOLEAN NOT NULL DEFAULT 'FALSE',
	data_attivazione DATE NOT NULL, 
	data_disattivazione DATE
);

INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza)
	VALUES ('Mario', 'Rossi', '10/12/1999','LAZIO'),
		   ('Giorgio', 'Bianchi', '09/25/1990','TOSCANA'),
		   ('Raffaele', 'Verdi', '7/6/1992','BASILICATA'),
		   ('Andrea', 'Neri', '3/7/1985','CAMPANIA');
		   
INSERT INTO fornitori ( numero_fornitore, denominazione, regione_residenza)
	VALUES  ('VINO', 'TOSCANA'),
			('OLIO', 'PUGLIA'),
			('BURRO', 'LOMBARDIA'),
			('RISO', 'VENETO');
			
INSERT INTO fatture (tipologia,importo,iva,id_cliente,data_fattura,numero_fornitori)
	VALUES  ('A', '540', '20%', 1, '12/12/2022', 1 ),
		    ('B', '350', '4%', 1, '12/12/2022', 1 ),
			('A', '260', '12%', 1, '12/12/2022', 2 ),
			('B', '980', '20%', 1, '12/12/2022', 2 );
			
INSERT INTO prodotti (descrizione,in_produzione, in_commercio,data_attivazione, data_disattivazione)
	VALUES ()
		   
SELECT * FROM clienti;
SELECT * FROM fornitori;
SELECT * FROM fatture;
SELECT * FROM 
