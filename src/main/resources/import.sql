/* Populate table Clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Subamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1, 'carlos', 'canabal', 'c@gmail.com', NOW());
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (5, 'maria', 'canabal', 'm@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (4, 'graciela', 'canabal', 'g@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (6, 'johnny', 'canabal', 'j@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (2, 'laura', 'canabal', 'la@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1, 'luciano', 'canabal', 'lu@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8, 'moraima', 'canabal', 'mo@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (7, 'lola', 'canabal', 'lo@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (4, 'antonia', 'canabal', 'an@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (7, 'ricardo', 'canabal', 'ri@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1, 'enrique', 'canabal', 'en@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (2, 'eliecer', 'canabal', 'er@gmail.com', '2018-01-01');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('carlos', '$2a$10$S/9kzAFu4jhdFShRWesNoODm4LF6O476B1oipUKiO4b7tXssQbdW2', 1, 'Carlos','Canabal','ccanabalr@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$GbOcGDVY02rgoIFrza.PzuKYZD9UApmavrYX4SUl9bLE9/UdMT7pW', 1, 'Enrique','Rivera','admin@admin.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);


INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple Ipod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi Bicicleta Aro 2', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Mica comoda 5 Cajones', 299990, NOW());


INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 2, 6);
