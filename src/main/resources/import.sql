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

-- ==========================================
-- MUNICIPIOS
-- ==========================================
-- Abel Iturralde (Provincia 1)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('IXIAMAS', TRUE, NOW(), NOW(), 1);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN BUENAVENTURA', TRUE, NOW(), NOW(), 1);

-- Aroma (Provincia 2)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AYO AYO', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CALAMARCA', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLLANA', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLQUENCHA', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PATACAMAYA', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SICA SICA', TRUE, NOW(), NOW(), 2);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('UMALA', TRUE, NOW(), NOW(), 2);

-- Bautista Saavedra (Provincia 3)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CURVA', TRUE, NOW(), NOW(), 3);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHARAZANI', TRUE, NOW(), NOW(), 3);

-- Camacho (Provincia 4)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ESCOMA', TRUE, NOW(), NOW(), 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUMANATA', TRUE, NOW(), NOW(), 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MOCOMOCO', TRUE, NOW(), NOW(), 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO ACOSTA', TRUE, NOW(), NOW(), 4);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO CARABUCO', TRUE, NOW(), NOW(), 4);

-- Caranavi (Provincia 5)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ALTO BENI', TRUE, NOW(), NOW(), 5);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CARANAVI', TRUE, NOW(), NOW(), 5);

-- Franz Tamayo (Provincia 6)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('APOLO', TRUE, NOW(), NOW(), 6);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PELECHUCO', TRUE, NOW(), NOW(), 6);

-- Gualberto Villarroel (Provincia 7)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHACARILLA', TRUE, NOW(), NOW(), 7);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PAPEL PAMPA', TRUE, NOW(), NOW(), 7);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN PEDRO DE CURAHUARA', TRUE, NOW(), NOW(), 7);

-- Ingavi (Provincia 8)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('DESAGUADERO', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('GUAQUI', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('JESÚS DE MACHACA', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN ANDRÉS DE MACHACA', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TARACO', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TIAHUANACO', TRUE, NOW(), NOW(), 8);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('VIACHA', TRUE, NOW(), NOW(), 8);

-- Inquisivi (Provincia 9)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAJUATA', TRUE, NOW(), NOW(), 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COLQUIRI', TRUE, NOW(), NOW(), 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ICHOCA', TRUE, NOW(), NOW(), 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('INQUISIVI', TRUE, NOW(), NOW(), 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LICOMA PAMPA', TRUE, NOW(), NOW(), 9);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('QUIME', TRUE, NOW(), NOW(), 9);

-- José Manuel Pando (Provincia 10)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CATACORA', TRUE, NOW(), NOW(), 10);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE MACHACA', TRUE, NOW(), NOW(), 10);

-- Larecaja (Provincia 11)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COMBAYA', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('GUANAY', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MAPIRI', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('QUIABAYA', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SORATA', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TACACOMA', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TEOPONTE', TRUE, NOW(), NOW(), 11);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TIPUANI', TRUE, NOW(), NOW(), 11);

-- Loayza (Provincia 12)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAIROMA', TRUE, NOW(), NOW(), 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LURIBAY', TRUE, NOW(), NOW(), 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MALLA', TRUE, NOW(), NOW(), 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAPAHAQUI', TRUE, NOW(), NOW(), 12);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('YACO', TRUE, NOW(), NOW(), 12);

-- Los Andes (Provincia 13)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('BATALLAS', TRUE, NOW(), NOW(), 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LAJA', TRUE, NOW(), NOW(), 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUERTO PÉREZ', TRUE, NOW(), NOW(), 13);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PUCARANI', TRUE, NOW(), NOW(), 13);

-- Manco Kapac (Provincia 14)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COPACABANA', TRUE, NOW(), NOW(), 14);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SAN PEDRO DE TIQUINA', TRUE, NOW(), NOW(), 14);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('TITO YUPANQUI', TRUE, NOW(), NOW(), 14);

-- Muñecas (Provincia 15)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AUCAPATA', TRUE, NOW(), NOW(), 15);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('AYATA', TRUE, NOW(), NOW(), 15);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHUMA', TRUE, NOW(), NOW(), 15);

-- Murillo (Provincia 16)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ACHOCALLA', TRUE, NOW(), NOW(), 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('EL ALTO', TRUE, NOW(), NOW(), 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LA PAZ', TRUE, NOW(), NOW(), 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('MECAPACA', TRUE, NOW(), NOW(), 16);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PALCA', TRUE, NOW(), NOW(), 16);

-- Nor Yungas (Provincia 17)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COROICO', TRUE, NOW(), NOW(), 17);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CORIPATA', TRUE, NOW(), NOW(), 17);

-- Omasuyos (Provincia 18)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ACHACACHI', TRUE, NOW(), NOW(), 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('ANCORAIMES', TRUE, NOW(), NOW(), 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHUA COCANI', TRUE, NOW(), NOW(), 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUARINA', TRUE, NOW(), NOW(), 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('HUATAJATA', TRUE, NOW(), NOW(), 18);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE HUATA', TRUE, NOW(), NOW(), 18);

-- Pacajes (Provincia 19)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CALACOTO', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CAQUIAVIRI', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHARAÑA', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COMANCHE', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('COROCORO', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('NAZACARA DE PACAJES', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('SANTIAGO DE CALLAPA', TRUE, NOW(), NOW(), 19);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('WALDO BALLIVIÁN', TRUE, NOW(), NOW(), 19);

-- Sud Yungas (Provincia 20)
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('CHULUMANI', TRUE, NOW(), NOW(), 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('IRUPANA', TRUE, NOW(), NOW(), 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('LA ASUNTA', TRUE, NOW(), NOW(), 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('PALOS BLANCOS', TRUE, NOW(), NOW(), 20);
INSERT INTO MUNICIPIO(NOMBRE, ACTIVE, CREATED_AT, UPDATED_AT, ID_PROVINCIA) VALUES ('YANACACHI', TRUE, NOW(), NOW(), 20);
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

