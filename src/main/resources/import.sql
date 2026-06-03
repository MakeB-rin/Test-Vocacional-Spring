--PROVINCIA
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('ABEL ITURRALDE', true, '2024-03-01 12:34:56', '2024-03-05 08:23:45');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('AROMA', false, '2024-02-15 09:12:33', '2024-03-01 14:56:20');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('BAUTISTA SAAVEDRA', true, '2023-12-10 15:45:22', '2024-01-20 17:30:10');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('CAMACHO', false, '2024-01-05 07:30:50', '2024-02-10 11:40:55');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('CARANAVI', true, '2024-02-20 18:20:15', '2024-03-07 09:15:30');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('FRANZ TAMAYO', false, '2023-11-25 10:55:40', '2024-01-05 22:10:05');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('GUALBERTO VILLAROEL', true, '2024-01-30 13:45:30', '2024-02-25 19:35:50');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('INGAVI', false, '2023-10-15 06:10:20', '2023-12-30 20:25:15');
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('INQUISIVI', true, '2024-02-10 11:50:05', '2024-03-01 15:20:40');
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
INSERT INTO provincia(nombre, active, created_at, updated_at) VALUES ('SUD YUNGAS', false, '2023-09-05 17:30:10', '2023-11-15 08:45:25');


--MUNICIPIOS
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('IXIAMAS', TRUE, '2024-01-10 12:00:00', '2024-03-05 08:23:45', 1);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN BUENAVENTURA', FALSE, '2023-11-15 10:15:30', '2024-02-20 14:30:10', 1);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AYO AYO', TRUE, '2024-02-01 09:10:45', '2024-03-02 11:25:55', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CALAMARCA', FALSE, '2023-12-20 14:30:20', '2024-01-25 08:10:30', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLLANA', TRUE, '2024-01-05 18:20:15', '2024-03-07 09:15:30', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLQUENCHA', FALSE, '2023-10-25 12:40:00', '2024-02-18 17:50:45', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PATACAMAYA', TRUE, '2024-02-10 07:30:50', '2024-03-12 13:40:55', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SICA SICA', FALSE, '2023-09-05 15:45:10', '2024-01-30 22:15:25', 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('UMALA', TRUE, '2024-01-20 13:10:10', '2024-02-28 08:45:55', 2);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CURVA', FALSE, '2023-11-05 09:10:20', '2024-02-15 10:30:15', 3);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('GENERAL JUAN JOSÉ PÉREZ (CHARAZANI)', TRUE, '2024-02-15 11:50:05', '2024-03-01 15:20:40', 3);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ESCOMA', TRUE, '2024-01-10 17:30:10', '2024-03-05 08:23:45', 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUMANATA', FALSE, '2023-12-15 09:12:33', '2024-02-01 14:56:20', 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MOCOMOCO', TRUE, '2024-01-20 15:45:22', '2024-02-20 17:30:10', 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO ACOSTA', FALSE, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO CARABUCO', TRUE, '2024-02-20 18:20:15', '2024-03-07 09:15:30', 4);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ALTO BENI', TRUE, '2024-01-15 10:10:20', '2024-03-01 12:25:30', 5);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CARANAVI', FALSE, '2023-12-10 14:30:10', '2024-02-18 17:50:45', 5);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('APOLO', TRUE, '2024-01-08 11:45:30', '2024-03-10 14:40:50', 6);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PELECHUCO', FALSE, '2023-12-20 07:20:15', '2024-02-15 09:30:25', 6);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHACARILLA', TRUE, '2024-01-12 10:00:00', '2024-02-28 13:15:45', 7);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PAPEL PAMPA', FALSE, '2023-12-18 14:10:30', '2024-02-20 18:30:55', 7);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN PEDRO DE CURAHUARA', TRUE, '2024-02-05 17:50:45', '2024-03-12 07:45:10', 7);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('DESAGUADERO', FALSE, '2023-11-15 10:30:20', '2024-02-22 14:50:35', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('GUAQUI', TRUE, '2024-01-22 12:40:15', '2024-03-01 16:10:45', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('JESÚS DE MACHACA', FALSE, '2023-12-25 14:50:25', '2024-02-10 08:20:55', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN ANDRÉS DE MACHACA', TRUE, '2024-02-18 09:15:30', '2024-03-07 13:50:45', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TARACO', FALSE, '2023-11-30 16:40:10', '2024-02-28 19:25:30', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TIAHUANACO', TRUE, '2024-02-12 13:30:45', '2024-03-05 10:40:50', 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('VIACHA', FALSE, '2023-12-05 17:20:25', '2024-02-15 12:30:10', 8);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAJUATA', TRUE, '2024-01-10 12:00:00', '2024-03-05 08:23:45', 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLQUIRI', FALSE, '2023-12-15 14:10:30', '2024-02-20 18:30:55', 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ICHOCA', TRUE, '2024-01-05 18:20:15', '2024-03-07 09:15:30', 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('INQUISIVI', FALSE, '2023-10-25 12:40:00', '2024-02-18 17:50:45', 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LICOMA PAMPA', TRUE, '2024-02-10 07:30:50', '2024-03-12 13:40:55', 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('QUIME', FALSE, '2023-09-05 15:45:10', '2024-01-30 22:15:25', 9);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CATACORA', TRUE, '2024-01-15 10:10:20', '2024-03-01 12:25:30', 10);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE MACHACA', FALSE, '2023-12-10 14:30:10', '2024-02-18 17:50:45', 10);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COMBAYA', TRUE, '2024-01-08 11:45:30', '2024-03-10 14:40:50', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('GUANAY', FALSE, '2023-12-20 07:20:15', '2024-02-15 09:30:25', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MAPIRI', TRUE, '2024-01-10 17:30:10', '2024-03-05 08:23:45', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('QUIABAYA', FALSE, '2023-12-15 09:12:33', '2024-02-01 14:56:20', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SORATA', TRUE, '2024-01-20 15:45:22', '2024-02-20 17:30:10', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TACACOMA', FALSE, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TEOPONTE', TRUE, '2024-02-20 18:20:15', '2024-03-07 09:15:30', 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TIPUANI', FALSE, '2023-11-05 07:30:50', '2024-02-10 11:40:55', 11);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAIROMA', TRUE, '2024-01-12 10:00:00', '2024-02-28 13:15:45', 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LURIBAY', FALSE, '2023-12-18 14:10:30', '2024-02-20 18:30:55', 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MALLA', TRUE, '2024-02-05 17:50:45', '2024-03-12 07:45:10', 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAPHAQUI', FALSE, '2023-11-15 10:30:20', '2024-02-22 14:50:35', 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('YACO', TRUE, '2024-01-22 12:40:15', '2024-03-01 16:10:45', 12);

-- PROVINCIA LOS ANDES
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('BATALLAS', TRUE, '2024-01-08 09:30:00', '2024-02-28 13:15:45', 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LAJA', FALSE, '2023-12-05 14:10:30', '2024-02-20 18:30:55', 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO PÉREZ', TRUE, '2024-02-01 18:50:45', '2024-03-05 12:30:10', 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUCARANI', FALSE, '2023-11-25 11:40:25', '2024-02-18 09:40:20', 13);
-- PROVINCIA MANCO KAPAC
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COPACABANA', TRUE, '2024-01-15 08:45:00', '2024-03-01 14:00:25', 14);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN PEDRO DE TIQUINA', FALSE, '2023-12-20 13:30:10', '2024-02-10 11:10:50', 14);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TITO YUPANQUI', TRUE, '2024-02-10 15:20:00', '2024-03-05 09:45:35', 14);

-- PROVINCIA MUÑECAS
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AUCAPATA', TRUE, '2024-01-05 10:30:10', '2024-02-25 12:20:30', 15);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AYATA', FALSE, '2023-12-10 07:20:25', '2024-02-18 13:45:10', 15);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHUMA', TRUE, '2024-02-12 14:50:00', '2024-03-07 16:30:25', 15);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ACHOCALLA', TRUE, '2024-02-12 13:30:45', '2024-03-05 10:40:50', 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('EL ALTO', FALSE, '2023-12-05 17:20:25', '2024-02-15 12:30:10', 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LA PAZ', TRUE, '2024-01-10 10:20:15', '2024-02-25 15:45:30', 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MECAPACA', FALSE, '2023-11-30 16:40:10', '2024-02-28 19:25:30', 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PALCA', TRUE, '2024-01-12 09:30:25', '2024-03-10 14:40:50', 16);

-- CONTINÚA EL PATRÓN HASTA CUBRIR TODAS LAS PROVINCIAS Y MUNICIPIOS...
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COROICO', TRUE, '2024-01-14 08:45:20', '2024-03-06 10:30:15', 17);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CORIPATA', FALSE, '2023-12-20 17:10:30', '2024-02-22 12:15:40', 17);

INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ACHACACHI', TRUE, '2024-02-02 15:00:00', '2024-03-01 18:20:30', 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ANCORAIMES', FALSE, '2023-11-15 12:45:25', '2024-01-20 14:10:50', 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHUA COCANI', TRUE, '2024-01-12 09:30:45', '2024-02-25 16:40:10', 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUARINA', FALSE, '2023-12-25 14:20:15', '2024-03-02 17:50:30', 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUATAJATA', TRUE, '2024-02-15 10:30:40', '2024-03-05 13:10:20', 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE HUATA', FALSE, '2023-10-10 08:40:15', '2024-01-30 11:50:35', 18);
-- PROVINCIA PACAJES
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CALACOTO', TRUE, '2024-01-20 11:30:15', '2024-02-28 18:45:30', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAQUIAVIRI', FALSE, '2023-12-30 08:40:20', '2024-02-10 17:20:45', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHARAÑA', TRUE, '2024-01-10 09:15:25', '2024-03-01 13:10:00', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COMANCHE', FALSE, '2023-11-25 14:30:10', '2024-02-20 12:30:30', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CORO CORO', TRUE, '2024-02-18 10:20:40', '2024-03-05 14:40:00', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('NAZACARA DE PACAJES', FALSE, '2023-10-30 13:10:10', '2024-02-25 12:50:45', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE CALLAPA', TRUE, '2024-01-25 12:40:30', '2024-03-07 16:20:10', 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('WALDO BALLIVIÁN', FALSE, '2023-12-05 17:30:50', '2024-01-30 14:40:25', 19);

-- PROVINCIA NOR YUNGAS
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHULUMANI', TRUE, '2024-01-25 12:00:00', '2024-03-10 14:30:45', 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('IRUPANA', FALSE, '2023-12-15 16:10:30', '2024-02-20 18:30:55', 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LA ASUNTA', TRUE, '2024-01-10 17:50:45', '2024-03-05 08:23:45', 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PALOS BLANCOS', FALSE, '2023-11-30 14:30:20', '2024-02-28 19:25:30', 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('YANACACHI', TRUE, '2024-02-12 09:30:45', '2024-03-07 10:40:50', 20);

----------------
--- CHASIDE ----
----------------
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 1C', 'Administrativas, Contables y Económicas');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 2H', 'Humanísticas, Ciencias Jurídicas y Ciencias Sociales');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 3A', 'Artísticas');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 4S', 'Ciencias de la Salud');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 5I', 'Ingenierías, Carreras Técnicas y Computación');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 6D', 'Defensa y Seguridad');
INSERT INTO chaside (active, created_at, updated_at, codigo, descripcion) VALUES (true, NOW(), NOW(), 'TABLA 7E', 'Ciencias Agrarias de la Naturaleza, Zoológicas y Biológicas');

----------------
--- HOLLAND ----
----------------
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'R', 'Realista', 'Práctico, físico, concreto, orientado a la acción.');
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'I', 'Investigador', 'Analítico, curioso, intelectual, científico.');
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'A', 'Artístico', 'Creativo, imaginativo, expresivo, no convencional.');
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'S', 'Social', 'Cooperativo, comprensivo, servicial, orientado a las personas.');
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'E', 'Emprendedor', 'Persuasivo, líder, ambicioso, orientado a metas.');
INSERT INTO holland (active, created_at, updated_at, codigo, nombre, descripcion) VALUES (true, NOW(), NOW(), 'C', 'Convencional', 'Organizado, detallista, eficiente, práctico.');


--------------------
--- COLEGIOS -------
--------------------

INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'AVE MARIA', 3);
INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'SAGRADOS CORAZONES', 4);
INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'GREGORIO REYNOLS', 5);
INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'HUGO CHAVEZ', 6);
INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'MARIA INMACULADA', 10);
INSERT INTO colegio (active, created_at, updated_at, nombre, id_municipio) VALUES (true, NOW(), NOW(),'HUGO CARVAJAL', 19);

--------------------
--- ESTUDIANTES ----
--------------------
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, curso, id_colegio, id_municipio, active, created_at, updated_at) VALUES('OMAR', 'CALLE', 'GUACHALLA', '321654', 18, '45625', '6TO', 1, 1, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');
INSERT INTO estudiante (nombre, ap_paterno, ap_materno, ci_estudiante, edad, celular, curso, id_colegio,id_municipio, active, created_at, updated_at) VALUES('MARCO', 'QUISPE', 'ALANOCA', '852963', 17, '74152', '6TO', 3, 2, true, '2024-01-20 11:30:15', '2024-02-28 18:45:30');

----------------
--- FACULTAD ---
----------------
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FA', 'Facultad de Agronomia', 'http://agro.umsa.bo/', 'assets/logos-facultades/FA.png', 7, '["Ingenieria Agronomica", "Ingenieria en Produccion y Comercializacion Agropecuaria", "Programa Medicina Veterinaria y Zootecnia"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FAADU', 'Facultad de Arquitectura, Artes, Diseno y Urbanismo', 'http://faadu.umsa.bo/', 'assets/logos-facultades/FAADU.png', 3, '["Arquitectura", "Artes Plasticas", "Diseno Grafico", "Prog. Arquitectura para la Amazonia"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FCEF', 'Facultad de Ciencias Economicas y Financieras', 'https://fcef.umsa.bo/', 'assets/logos-facultades/FCEF.png', 1, '["Administracion de Empresas", "Contaduria Publica", "Economia"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FCFB', 'Facultad de Ciencias Farmaceuticas y Bioquimicas', 'http://www.farbio.edu.bo/', 'assets/logos-facultades/FCFB.png', 4, '["Bioquimica", "Quimica Farmaceutica"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FCG', 'Facultad de Ciencias Geologicas', 'http://fcg.umsa.bo/', 'assets/logos-facultades/FCG.png', 5, '["Ingenieria Geografica", "Ingenieria Geologica", "Programa Catastro y Ordenamiento Territorial", "Programa Geologia de Minas"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FCPN', 'Facultad de Ciencias Puras y Naturales', 'http://www.fcpn.edu.bo/fcpn/', 'assets/logos-facultades/FCPN.png', 5, '["Biologia", "Ciencias Quimicas", "Estadistica", "Fisica", "Informatica", "Matematica"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FCS', 'Facultad de Ciencias Sociales', 'http://fcs.umsa.bo/', 'assets/logos-facultades/FCS.png', 2, '["Antropologia y Arqueologia", "Ciencias de la Comunicacion Social", "Sociologia", "Trabajo Social"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FDCP', 'Facultad de Derecho y Ciencias Politicas', 'http://www.fdcp.umsa.bo/', 'assets/logos-facultades/FDCP.png', 2, '["Derecho", "Ciencias Politicas y Gestion Publica", "Programa Derecho de las Naciones Originarias"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FHCE', 'Facultad de Humanidades y Ciencias de la Educacion', 'https://fhce.umsa.bo/', 'assets/logos-facultades/FHCE.png', 2, '["Ciencias de la Informacion, Archivologia - Bibliotecologia - Documentacion - Museologia", "Ciencias de la Educacion", "Filosofia", "Historia", "Linguistica e Idiomas", "Literatura", "Psicologia", "Turismo"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FI', 'Facultad de Ingenieria', 'http://200.87.114.154/ffing/index.php', 'assets/logos-facultades/FI.png', 5, '["Ingenieria Ambiental", "Ingenieria de Alimentos", "Ingenieria Civil", "Ingenieria Electrica", "Ingenieria Mecanica y Electromecanica", "Ingenieria Electronica", "Ingenieria Industrial", "Mecatronica (MEC)", "Ingenieria Metalurgica y Materiales", "Ingenieria Petrolera", "Ingenieria Quimica", "Programa de Ing. Industrial Amazonica", "Programa de Ing. Petroquimica", "Programa de Ing. Produccion Industrial", "Programa de Ing. Seguridad Industrial y Salud Ocupacional"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FMENT', 'Facultad de Medicina, Enfermeria, Nutricion y Tecnologia Medica', 'http://fment.umsa.bo/', 'assets/logos-facultades/FMENT.png', 4, '["Medicina", "Enfermeria", "Nutricion y Dietetica", "Tecnologia Medica"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FO', 'Facultad de Odontologia', 'http://fo.umsa.bo/', 'assets/logos-facultades/FO.png', 4, '["Odontologia"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'FT', 'Facultad de Tecnologia', 'http://ft.umsa.bo/', 'assets/logos-facultades/FT.png', 5, '["Aeronautica", "Construcciones Civiles", "Electricidad Industrial", "Electronica y Telecomunicaciones", "Electromecanica", "Mecanica Automotriz", "Mecanica Industrial", "Quimica Industrial", "Geodesia, Topografia y Geomatica", "Programa Tec. Sup. Construccion", "Programa Tec. Sup. Electromecanica", "Programa Tec. Sup. Mecanica Automotriz", "Programa Tec. Med. Mecanica Automotriz", "Programa Tecnologia de Alimentos", "Programa Tec. Sup. Procesos Quimicos"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'ANAPOL', 'Academia Nacional de Policías (ANAPOL)', 'http://www.unipol.edu.bo/?page_id=223', '', 6, '["Oficial de Policía"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'COLMIL', 'Colegio Militar del Ejército - Cnl. Gualberto Villarroel', 'https://www.colmil.mil.bo/', '', 6, '["Oficial del Ejército"]');
INSERT INTO facultad (active, created_at, updated_at, codigo, nombre, url, img_logo, id_chaside, carreras) VALUES (true, NOW(), NOW(), 'COLMILAV', 'Colegio Militar de Aviación (COLMILAV)', 'https://fab.bo/colmilav/', '', 6, '["Oficial de la Fuerza Aérea"]');

----------------
---  USUARIO ---
----------------

INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 1, now(), now(), 'ADMIN', 'ADMINISTRADOR', '$2a$10$dZTWcB1gfFI11HxZdVWQSuBkYaAon1He/dVL9hkfDAlBMG2d0gYeK');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 2, now(), now(), 'ADMIN1', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 3, now(), now(), 'ADMIN2', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 4, now(), now(), 'ADMIN3', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');
INSERT INTO usuario (active, id_usuario, created_at, updated_at, username, nombre, password) VALUES (true, 5, now(), now(), 'ADMIN4', 'ADMINISTRADOR', '$2a$10$Qb99gA8roPHnJX0IXJ8e5.iPyumHBfoF8YrsGnMfmYgiQigUBZoEy');

