CREATE TABLE AUTOR (ID BIGINT NOT NULL, APELLIDOS VARCHAR(255), FECHANACIMIENTO DATE, INDICEH INTEGER, NOMBRE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE ARTICULO (ID BIGINT NOT NULL, ANIO INTEGER, NUMERO INTEGER, PAGINAFINAL INTEGER, PAGINAINICIAL INTEGER, PUBLICACION VARCHAR(255), TITULO VARCHAR(255), VOLUMEN INTEGER, PRIMARY KEY (ID))
CREATE TABLE Autor_FIRMAS (Autor_ID BIGINT, FIRMAS VARCHAR(255))
CREATE TABLE ARTICULO_AUTOR (Articulo_ID BIGINT NOT NULL, autores_ID BIGINT NOT NULL, PRIMARY KEY (Articulo_ID, autores_ID))
ALTER TABLE Autor_FIRMAS ADD CONSTRAINT AutorFIRMASAutorID FOREIGN KEY (Autor_ID) REFERENCES AUTOR (ID)
ALTER TABLE ARTICULO_AUTOR ADD CONSTRAINT RTCLOAUTORrtculoID FOREIGN KEY (Articulo_ID) REFERENCES ARTICULO (ID)
ALTER TABLE ARTICULO_AUTOR ADD CONSTRAINT RTCULOAUTORtoresID FOREIGN KEY (autores_ID) REFERENCES AUTOR (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)