--PROVINCIA
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('ABEL ITURRALDE', true, '2024-03-01 12:34:56', '2024-03-05 08:23:45');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('AROMA', false, '2024-02-15 09:12:33', '2024-03-01 14:56:20');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('BAUTISTA SAAVEDRA', true, '2023-12-10 15:45:22', '2024-01-20 17:30:10');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('CAMACHO', false, '2024-01-05 07:30:50', '2024-02-10 11:40:55');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('CARANAVI', true, '2024-02-20 18:20:15', '2024-03-07 09:15:30');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('FRANZ TAMAYO', false, '2023-11-25 10:55:40', '2024-01-05 22:10:05');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('GUALBERTO VILLAROEL', true, '2024-01-30 13:45:30', '2024-02-25 19:35:50');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('INGAVI', false, '2023-10-15 06:10:20', '2023-12-30 20:25:15');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('INQUISIVO', true, '2024-02-10 11:50:05', '2024-03-01 15:20:40');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('JOSE MANUEL PANDO', false, '2023-09-05 17:30:10', '2023-11-15 08:45:25');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('LARECAJA', true, '2024-03-01 12:34:56', '2024-03-05 08:23:45');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('LOAYZA', false, '2024-02-15 09:12:33', '2024-03-01 14:56:20');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('LOS ANDES', true, '2023-12-10 15:45:22', '2024-01-20 17:30:10');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('MANCO KAPAC', false, '2024-01-05 07:30:50', '2024-02-10 11:40:55');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('MUÑECAS', true, '2024-02-20 18:20:15', '2024-03-07 09:15:30');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('MURILLO', false, '2023-11-25 10:55:40', '2024-01-05 22:10:05');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('NOR YUNGAS', true, '2024-01-30 13:45:30', '2024-02-25 19:35:50');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('OMASUYOS', false, '2023-10-15 06:10:20', '2023-12-30 20:25:15');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('PACAJES', true, '2024-02-10 11:50:05', '2024-03-01 15:20:40');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('SUDYUNGAS', false, '2023-09-05 17:30:10', '2023-11-15 08:45:25');


--MUNICIPIOS
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Ixiamas', true, '2024-01-10 12:00:00', '2024-03-05 08:23:45', 1);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('San Buenaventura', false, '2023-11-15 10:15:30', '2024-02-20 14:30:10', 1);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Ayo Ayo', true, '2024-02-01 09:10:45', '2024-03-02 11:25:55', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Calamarca', false, '2023-12-20 14:30:20', '2024-01-25 08:10:30', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Collana', true, '2024-01-05 18:20:15', '2024-03-07 09:15:30', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Colquencha', false, '2023-10-25 12:40:00', '2024-02-18 17:50:45', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Patacamaya', true, '2024-02-10 07:30:50', '2024-03-12 13:40:55', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Sica Sica', false, '2023-09-05 15:45:10', '2024-01-30 22:15:25', 2);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Umala', true, '2024-01-20 13:10:10', '2024-02-28 08:45:55', 2);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Curva', false, '2023-11-05 09:10:20', '2024-02-15 10:30:15', 3);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('General Juan José Pérez (Charazani)', true, '2024-02-15 11:50:05', '2024-03-01 15:20:40', 3);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Escoma', true, '2024-01-10 17:30:10', '2024-03-05 08:23:45', 4);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Humanata', false, '2023-12-15 09:12:33', '2024-02-01 14:56:20', 4);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Mocomoco', true, '2024-01-20 15:45:22', '2024-02-20 17:30:10', 4);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Puerto Acosta', false, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 4);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Puerto Carabuco', true, '2024-02-20 18:20:15', '2024-03-07 09:15:30', 4);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Alto Beni', true, '2024-01-15 10:10:20', '2024-03-01 12:25:30', 5);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Caranavi', false, '2023-12-10 14:30:10', '2024-02-18 17:50:45', 5);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Apolo', true, '2024-01-08 11:45:30', '2024-03-10 14:40:50', 6);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Pelechuco', false, '2023-12-20 07:20:15', '2024-02-15 09:30:25', 6);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Chacarilla', true, '2024-01-12 10:00:00', '2024-02-28 13:15:45', 7);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Papel Pampa', false, '2023-12-18 14:10:30', '2024-02-20 18:30:55', 7);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('San Pedro de Curahuara', true, '2024-02-05 17:50:45', '2024-03-12 07:45:10', 7);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Desaguadero', false, '2023-11-15 10:30:20', '2024-02-22 14:50:35', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Guaqui', true, '2024-01-22 12:40:15', '2024-03-01 16:10:45', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Jesús de Machaca', false, '2023-12-25 14:50:25', '2024-02-10 08:20:55', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('San Andrés de Machaca', true, '2024-02-18 09:15:30', '2024-03-07 13:50:45', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Taraco', false, '2023-11-30 16:40:10', '2024-02-28 19:25:30', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Tiahuanaco', true, '2024-02-12 13:30:45', '2024-03-05 10:40:50', 8);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Viacha', false, '2023-12-05 17:20:25', '2024-02-15 12:30:10', 8);

-- Continúa con el mismo patrón para las provincias restantes...

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Cajuata', true, '2024-01-10 12:00:00', '2024-03-05 08:23:45', 9);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Colquiri', false, '2023-12-15 14:10:30', '2024-02-20 18:30:55', 9);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Ichoca', true, '2024-01-05 18:20:15', '2024-03-07 09:15:30', 9);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Inquisivi', false, '2023-10-25 12:40:00', '2024-02-18 17:50:45', 9);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Licoma Pampa', true, '2024-02-10 07:30:50', '2024-03-12 13:40:55', 9);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Quime', false, '2023-09-05 15:45:10', '2024-01-30 22:15:25', 9);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Catacora', true, '2024-01-15 10:10:20', '2024-03-01 12:25:30', 10);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Santiago de Machaca', false, '2023-12-10 14:30:10', '2024-02-18 17:50:45', 10);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Combaya', true, '2024-01-08 11:45:30', '2024-03-10 14:40:50', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Guanay', false, '2023-12-20 07:20:15', '2024-02-15 09:30:25', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Mapiri', true, '2024-01-10 17:30:10', '2024-03-05 08:23:45', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Quiabaya', false, '2023-12-15 09:12:33', '2024-02-01 14:56:20', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Sorata', true, '2024-01-20 15:45:22', '2024-02-20 17:30:10', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Tacacoma', false, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Teoponte', true, '2024-02-20 18:20:15', '2024-03-07 09:15:30', 11);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Tipuani', false, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 11);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Cairoma', true, '2024-01-12 10:00:00', '2024-02-28 13:15:45', 12);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Luribay', false, '2023-12-18 14:10:30', '2024-02-20 18:30:55', 12);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Malla', true, '2024-02-05 17:50:45', '2024-03-12 07:45:10', 12);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Sapahaqui', false, '2023-11-15 10:30:20', '2024-02-22 14:50:35', 12);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Yaco', true, '2024-01-22 12:40:15', '2024-03-01 16:10:45', 12);

-- Provincia Los Andes
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Batallas', true, '2024-01-08 09:30:00', '2024-02-28 13:15:45', 13);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Laja', false, '2023-12-05 14:10:30', '2024-02-20 18:30:55', 13);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Puerto Pérez', true, '2024-02-01 18:50:45', '2024-03-05 12:30:10', 13);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Pucarani', false, '2023-11-25 11:40:25', '2024-02-18 09:40:20', 13);

-- Provincia Manco Kapac
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Copacabana', true, '2024-01-15 08:45:00', '2024-03-01 14:00:25', 14);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('San Pedro de Tiquina', false, '2023-12-20 13:30:10', '2024-02-10 11:10:50', 14);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Tito Yupanqui', true, '2024-02-10 15:20:00', '2024-03-05 09:45:35', 14);

-- Provincia Muñecas
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Aucapata', true, '2024-01-05 10:30:10', '2024-02-25 12:20:30', 15);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Ayata', false, '2023-12-10 07:20:25', '2024-02-18 13:45:10', 15);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Chuma', true, '2024-02-12 14:50:00', '2024-03-07 16:30:25', 15);


INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Achocalla', true, '2024-02-12 13:30:45', '2024-03-05 10:40:50', 16);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('El Alto', false, '2023-12-05 17:20:25', '2024-02-15 12:30:10', 16);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('La Paz', true, '2024-01-10 10:20:15', '2024-02-25 15:45:30', 16);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Mecapaca', false, '2023-11-30 16:40:10', '2024-02-28 19:25:30', 16);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Palca', true, '2024-01-12 09:30:25', '2024-03-10 14:40:50', 16);

-- Continúa el patrón hasta cubrir todas las provincias y municipios...
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Coroico', true, '2024-01-14 08:45:20', '2024-03-06 10:30:15', 17);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Coripata', false, '2023-12-20 17:10:30', '2024-02-22 12:15:40', 17);

INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Achacachi', true, '2024-02-02 15:00:00', '2024-03-01 18:20:30', 18);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Ancoraimes', false, '2023-11-15 12:45:25', '2024-01-20 14:10:50', 18);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Chua Cocani', true, '2024-01-12 09:30:45', '2024-02-25 16:40:10', 18);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Huarina', false, '2023-12-25 14:20:15', '2024-03-02 17:50:30', 18);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Huatajata', true, '2024-02-15 10:30:40', '2024-03-05 13:10:20', 18);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Santiago de Huata', false, '2023-10-10 08:40:15', '2024-01-30 11:50:35', 18);

-- Provincia Pacajes
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Calacoto', true, '2024-01-20 11:30:15', '2024-02-28 18:45:30', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Caquiaviri', false, '2023-12-30 08:40:20', '2024-02-10 17:20:45', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Charaña', true, '2024-01-10 09:15:25', '2024-03-01 13:10:00', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Comanche', false, '2023-11-25 14:30:10', '2024-02-20 12:30:30', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Coro Coro', true, '2024-02-18 10:20:40', '2024-03-05 14:40:00', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Nazacara de Pacajes', false, '2023-10-30 13:10:10', '2024-02-25 12:50:45', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Santiago de Callapa', true, '2024-01-25 12:40:30', '2024-03-07 16:20:10', 19);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Waldo Ballivián', false, '2023-12-05 17:30:50', '2024-01-30 14:40:25', 19);


INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Chulumani', true, '2024-01-25 12:00:00', '2024-03-10 14:30:45', 20);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Irupana', false, '2023-12-15 16:10:30', '2024-02-20 18:30:55', 20);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('La Asunta', true, '2024-01-10 17:50:45', '2024-03-05 08:23:45', 20);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Palos Blancos', false, '2023-11-30 14:30:20', '2024-02-28 19:25:30', 20);
INSERT INTO municipio(nombre, active, created_at, updated_at, id_provincia) VALUES ('Yanacachi', true, '2024-02-12 09:30:45', '2024-03-07 10:40:50', 20);


-- Chaside
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 1C');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 2H');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 3A');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 4S');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 5I');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 6D');
INSERT INTO chaside (active, created_at, updated_at, codigo) VALUES (true, NOW(), NOW(), 'Tabla 7E');
-- Holland
INSERT INTO holland (active, personalidad, created_at, updated_at) VALUES (true, 1, NOW(), NOW());
INSERT INTO holland (active, personalidad, created_at, updated_at) VALUES (true, 2, NOW(), NOW());
INSERT INTO holland (active, personalidad, created_at, updated_at) VALUES (true, 3, NOW(), NOW());
INSERT INTO holland (active, personalidad, created_at, updated_at) VALUES (true, 4, NOW(), NOW());


INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('OMAR', 'CALLE', 'GUACHALLA', '321654', 18, '45625', 'SAN SIMON', '6TO', 1, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('MARCO', 'QUISPE', 'ALANOCA', '852963', 17, '74152', 'BOLIVAR', '6TO', 2, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('OSCAR', 'MARIN', 'VELASQUEZ', '253411', 18, '52637', 'AYACUCHO', '6TO', 3, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('NEIL', 'ARUQUIPA', 'TOLA', '741852', 17, '78956', 'HUGO CHAVEZ', '6TO', 4, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('FERNANDO', 'PEREZ', 'LOAYZA', '456852', 19, '58697', 'CARLOS MEDINACELLI', '6TO', 9, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('ALEX', 'FUENTES', 'CATACORA', '963456', 16, '25145', '4 DE JULIO', '6TO', 5, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('VANESSA', 'MENDOZA', 'FLORES', '123852', 17, '52638', 'LOS ANDES', '6TO', 6, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('NICKOL', 'PAREDES', 'MORALES', '741879', 18, '96857', 'SLOMON', '6TO', 7, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('JUANA', 'MAMANI', 'SULLY', '456221', 19, '55236', 'DORA SCHMIT', '6TO', 8, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('RAQUEL', 'LOZA', 'PEDRAZA', '112255', 17, '65421', 'BOLVIA', '6TO', 10, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('FEDERICO', 'BOLAÑOS', 'GOMEZ', '458796', 17, '85967', 'SARACHO', '6TO', 12, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('GONZALO', 'GONZALES', 'GARCIA', '965236', 16, '85231', 'CALVERT', '6TO', 13, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('FRANCO', 'HUANCA', 'MONCADA', '362547', 18, '12356', 'BOLIVIAN-SUECO', '6TO', 14, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('ESTELA', 'QUINO', 'AVERANGA', '745214', 18, '35789', 'SAGRADOS CORAZONES', '6TO', 15, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, colegio, curso, id_municipio, active, created_at, updated_at) VALUES('MARIO', 'TARQUI', 'NINA', '96357', 19, '96325', 'DON BOSCO', '6TO', 16, true, NOW(), NOW());

----------------
--- FACULTAD ---
----------------
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FA', 'FACULTAD DE AGRONOMÍA', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FAADU', 'FACULTAD DE ARQUITECTURA, ARTES, DISEÑO Y URBANISMO', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FCEF', 'FACULTAD DE CIENCIAS ECONÓMICAS Y FINANCIERAS', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FCFB', 'FACULTAD DE CIENCIAS FARMACÉUTICAS Y BIOQUÍMICAS', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FCG', 'FACULTAD DE CIENCIAS GEOLÓGICAS', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FCPN', 'FACULTAD DE CIENCIAS PURAS Y NATURALES', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FCS', 'FACULTAD DE CIENCIAS SOCIALES', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FDCP', 'FACULTAD DE DERECHO Y CIENCIAS POLÍTICAS', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FHCE', 'FACULTAD DE HUMANIDADES Y CIENCIAS DE LA EDUCACIÓN', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FI', 'FACULTAD DE INGENIERÍA', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FMENT', 'FACULTAD DE MEDICINA, ENFERMERÍA, NUTRICIÓN Y TECNOLOGÍA MÉDICA', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FO', 'FACULTAD DE ODONTOLOGÍA', true, NOW(), NOW());
INSERT INTO facultad (codigo, nombre, active, created_at, updated_at) VALUES ('FT', 'FACULTAD DE TECNOLOGÍA', true, NOW(), NOW());

----------------
---  USUARIO ---
----------------
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 1, now(), now(), 'ADMIN', 'ADMINISTRADOR', '$2a$10$dZTWcB1gfFI11HxZdVWQSuBkYaAon1He/dVL9hkfDAlBMG2d0gYeK');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 2, now(), now(), 'ADMIN1', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 3, now(), now(), 'ADMIN2', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 4, now(), now(), 'ADMIN3', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 5, now(), now(), 'ADMIN4', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');

INSERT INTO resultado (active, aptitud, id_chaside, id_estudiante, id_facultad, id_holland, interes, created_at, updated_at, fecha, puntaje_holland) VALUES (true, 80, 1, 6, 1, 1, 75, NOW(), NOW(), NOW(), 'R:10, I:8, A:7, S:6, E:5, C:4');
INSERT INTO resultado (active, aptitud, id_chaside, id_estudiante, id_facultad, id_holland, interes, created_at, updated_at, fecha, puntaje_holland) VALUES (true, 70, 2, 6, 2, 2, 85, NOW(), NOW(), NOW(), 'I:9, R:7, A:6, S:5, C:4, E:3');
INSERT INTO resultado (active, aptitud, id_chaside, id_estudiante, id_facultad, id_holland, interes, created_at, updated_at, fecha, puntaje_holland) VALUES (true, 90, 3, 3, 3, 3, 92, NOW(), NOW(), NOW(), 'A:10, E:9, S:8, I:7, R:6, C:5');
INSERT INTO resultado (active, aptitud, id_chaside, id_estudiante, id_facultad, id_holland, interes, created_at, updated_at, fecha, puntaje_holland) VALUES (true, 65, 4, 4, 4, 4, 70, NOW(), NOW(), NOW(), 'S:8, E:7, C:6, R:5, I:4, A:3');
INSERT INTO resultado (active, aptitud, id_chaside, id_estudiante, id_facultad, id_holland, interes, created_at, updated_at, fecha, puntaje_holland) VALUES (true, 88, 5, 5, 1, 1, 81, NOW(), NOW(), NOW(), 'E:9, A:8, S:7, I:6, C:5, R:4');