insert into area values (1,'Computacion','0800');
insert into area values (2,'Quimica','0900');
insert into area values (3,'Matemáticas','0500');
insert into area values (4,'Gerencia','0300');

insert into carrera values (1,'0100', 'Ingeniería Eléctrica');
insert into carrera values (2,'0200', 'Ingeniería Mecánica');
insert into carrera values (3,'0300', 'Ingeniería Química');
insert into carrera values (4,'0400', 'Licenciatura Química');
insert into carrera values (5,'0500', 'Licenciatura en Matemática');
insert into carrera values (6,'0600', 'Ingeniería Electrónica');
insert into carrera values (7,'0700', 'Arquitectura');
insert into carrera values (8,'0800', 'Ingeniería en Computación');
insert into carrera values (9,'1000', 'Licenciatura en Física');
insert into carrera values (10,'1100', 'Urbanismo');
insert into carrera values (11,'1200', 'Ingeniería en Geofísica');
insert into carrera values (12,'1500', 'Ingeniería de Materiales');
insert into carrera values (13,'1700', 'Ingeniería de Producción');
insert into carrera values (14,'1900', 'Licenciatura en Biología');
insert into carrera values (15,'0011', 'Licenciatura en Gestión de la Hospitalidad');

insert into estudiante values (1,'06-39223','Emily Benítez','V-19718764','3.2','Femenino','Venezolana','07/05/1991');
insert into estudiante values (4,'06-39911','Andrea Mendoza','V-17171171','3.5','Femenino','Venezolana','11/20/1989');
insert into estudiante values (2,'06-39239','Natalya Blanco','V-17667212','3.5','Femenino','Venezolana','08/01/1989');
insert into estudiante values (3,'05-37843','Ruben Arevalo','V-19888888','3.0001','Masculino','Venezolana','02/13/1989');
insert into estudiante values (5,'06-40273','Daniela Ruiz','V-17999999','3.4','Femenino','Venezolana','11/23/1988');
insert into estudiante values (6,'06-39123','Leopoldo Lopez','V-19718765','4.8','Masculino','Venezolana','07/05/1982');
insert into estudiante values (7,'06-39456','Monica Hernandez','V-19718761','3.7','Femenino','Venezolana','07/11/1984');

insert into escoordinador values (1,'sabad','0800');

insert into estcursacarrera values (1,'06-39223','0800');
insert into estcursacarrera values (6,'06-39123','0800');
insert into estcursacarrera values (7,'06-39456','0800');
insert into estcursacarrera values (2,'06-39239','1700');
insert into estcursacarrera values (3,'06-39911','1700');
insert into estcursacarrera values (4,'05-37843','0011');
insert into estcursacarrera values (5,'06-40273','0011');

insert into profesor values (1,'Soraya Abad','sabad','Computación y TI','0212-1234567','sabad@usb.ve','Bases de Datos');
insert into profesor values (2,'Kenyer Dominguez','kdominguez','Computación y TI','0212-9876543','kdominguez@usb.ve','Sistemas de Información');
insert into profesor values (3,'Zoraida Chiquin','zchiquin','Procesos y Sistemas','0416-1111111','zchiquin@usb.ve','Sistemas de Información');
insert into profesor values (4,'Pedro Pérez','pperez','Matemáticas','0212-121212','pperez@usb.ve','Estadística');

insert into usuario values (1,'06-39223','12345','estudiante');
insert into usuario values (2,'06-39239','12345','estudiante');
insert into usuario values (3,'05-37843','12345','estudiante');
insert into usuario values (4,'sabad','12345','profesor');
insert into usuario values (5,'kdominguez','12345','profesor');
insert into usuario values (6,'06-39911','12345','estudiante');
insert into usuario values (7,'zchiquin','12345','profesor');
insert into usuario values (8,'pperez','12345','profesor');
insert into usuario values (9,'06-40273','12345','estudiante');
insert into usuario values (10,'06-39123','12345','estudiante');
insert into usuario values (11,'06-39456','12345','estudiante');

INSERT INTO esjurado (idesjurado, nombreppg, fechaasignacion, fechadefensa, areajurado, areaproyecto, nombreprofesor, idpasantia, idppg, pasantia, esppg, tutoreo) VALUES (1, 'PG1', '2011-12-21', '2154-12-02', 'Fisica', '1', 'Pedrito', 1, 1, '1', true, 5);
INSERT INTO esjurado (idesjurado, nombreppg, fechaasignacion, fechadefensa, areajurado, areaproyecto, nombreprofesor, idpasantia, idppg, pasantia, esppg, tutoreo) VALUES (2, 'PG2', '2011-12-21', '2154-12-02', 'Quimica', '2', 'Luisito', 2, 2, '2', true, 1);
INSERT INTO esjurado (idesjurado, nombreppg, fechaasignacion, fechadefensa, areajurado, areaproyecto, nombreprofesor, idpasantia, idppg, pasantia, esppg, tutoreo) VALUES (3, 'P1', '2155-01-01', '2166-02-02', 'Quimica', '3', 'Mariita', 3, 3, '3', false, 0);      
