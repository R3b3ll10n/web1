/*Tabla de registros usuarios*/

/*Eliminamos el usuario pr_cofares_admin si existiera*/
/*DROP USER 'pr_cofares_admin'@'localhost';*/

CREATE USER 'pr_cofares_admin'@'localhost' IDENTIFIED BY 'pr_cofares_admin';

GRANT ALL PRIVILEGES ON * . * TO 'pr_cofares_admin'@'localhost';

FLUSH PRIVILEGES;

DROP DATABASE IF EXISTS PRCOFARES;

CREATE DATABASE PRCOFARES;

USE PRCOFARES;

CREATE TABLE registros_usuarios (
	id INT(4) AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	lastname VARCHAR(30),
	password VARCHAR(15)
);

INSERT INTO registros_usuarios (name, lastname, password) VALUES
('Carleton','Kub','quibusdam'),
('Philip','Luettgen','quisquam'),
('Isaiah','Kling','eius'),
('Tanner','Schowalter','quasi'),
('Jonas','Kuphal','saepe'),
('Kelvin','Hermiston','suscipit'),
('Caesar','Lakin','sequi'),
('Mustafa','Mayer','quia'),
('Moriah','Mante','laudantium'),
('Alex','Little','ut'),
('Patrick','Ebert','quo'),
('Wiley','Pfannerstill','ut'),
('Buck','Boyle','quo'),
('Lazaro','Nikolaus','est'),
('Chet','Purdy','temporibus'),
('Niko','Torp','ea'),
('Arthur','Blick','qui'),
('Randal','Stiedemann','quis'),
('Rollin','Shields','modi');