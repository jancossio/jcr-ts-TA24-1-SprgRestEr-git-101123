DROP TABLE IF EXISTS fabricante;
DROP table IF EXISTS articulo;


CREATE TABLE fabricante (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(250) DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE articulos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(250) DEFAULT NULL,
  precio  int DEFAULT NULL,
  cod_fabricante  int DEFAULT NULL,
  PRIMARY KEY (codigo),
  FOREIGN KEY (cod_fabricante) REFERENCES fabricante (codigo)
);


insert into fabricante (nombre)values('Piezas.sa');
insert into fabricante (nombre)values('Trozos Anonimos');
insert into fabricante (nombre)values('Componentes.sl');
insert into fabricante (nombre)values('Tu Ordenador');
insert into fabricante (nombre)values('A cachos.sa');

insert into articulos (nombre, precio, cod_fabricante) values ('Placa base',24,1);
insert into articulos (nombre, precio, cod_fabricante) values ('Pantalla',65,2);
insert into articulos (nombre, precio, cod_fabricante) values ('Altavoz',24,3);
insert into articulos (nombre, precio, cod_fabricante) values ('Raton',6,4);
insert into articulos (nombre, precio, cod_fabricante) values ('Teclado',9,5);