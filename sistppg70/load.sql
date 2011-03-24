insert into usuario values (1, '07-41896', 'estudiante');
insert into usuario values (2, 'zchiquin', 'profesor');

insert into carrera values (1, 'Ingeniería Eléctrica', 'coord-ee@usb.ve');
insert into carrera values (2, 'Ingeniería de Computación', 'coord-comp@usb.ve');
insert into carrera values (3, 'Ingeniería Mecánica', 'coord-mec@usb.ve');
insert into carrera values (4, 'Ingeniería Eléctronica', 'coord-electronia@usb.ve');

insert into departamento values (1, 'Computación y Tecnología de la Información');
insert into departamento values (2, 'Procesos y Sistemas');
insert into departamento values (3, 'Física');
insert into departamento values (4, 'Química');
insert into departamento values (5, 'Computo Científico y Estadística');
insert into departamento values (6, 'Electrónica y Circuitos');

insert into area values (1, 'Bases de Datos');
insert into area values (2, 'Lenguajes y Algoritmos');
insert into area values (3, 'Inteligencia Artificial');
insert into area values (4, 'Sistemas Paralelos y Distribuidos');
insert into area values (5, 'Gráficas, Interfaces y Multimedia');
insert into area values (6, 'Procesos Químicos');
insert into area values (7, 'Sistemas de Información');
insert into area values (8, 'Sistemas de Control');

insert into departamentoarea values (1, 1, 1);
insert into departamentoarea values (2, 2, 1);
insert into departamentoarea values (3, 3, 1);
insert into departamentoarea values (4, 4, 1);
insert into departamentoarea values (5, 5, 1);
insert into departamentoarea values (6, 6, 2);
insert into departamentoarea values (7, 7, 2);
insert into departamentoarea values (8, 8, 2);

insert into estatuspasantia values (1, 'Inscrita');
insert into estatuspasantia values (2, 'Aprobada');

insert into pais values (1, 'Venezuela');
insert into pais values (2, 'Colombia');
insert into pais values (3, 'Brasil');

insert into ciudad values (1, 'Caracas', 1);
insert into ciudad values (2, 'Valencia', 1);
insert into ciudad values (3, 'Maracaibo', 1);
insert into ciudad values (4, 'Bogotá', 2);
insert into ciudad values (5, 'Rio de Janeiro', 3);

insert into empresa values (1, 'cantv', '12345', 'CANTV','J-12348','0212-3721331', 'Av Andres Bello',1);

insert into tutorindustrial values (1, 'Carlos', '1812345', 'cars@cantv.net','0212-3721731', 1, 'Sistemas','Ingeniero Informático','Av. Baralt Casa #12','Gerente','cars','12345');

insert into pasantia values (1, 'Pasantía de Investigación', 1, 1, 1, 1, 'Investigar cosas en mi pasantía', 'objetivos');

insert into periodopasantiaintermedia values (1, 'Enero-Marzo');
insert into periodopasantiaintermedia values (2, 'Abril-Julio');
insert into periodopasantiaintermedia values (3, 'Septiembre-Diciembre');
insert into periodopasantiaintermedia values (4, 'Octubre-Febrero');

insert into periodopasantialarga values (1, 'Enero-Mayo');
insert into periodopasantialarga values (2, 'Abril-Septiembre');
insert into periodopasantialarga values (3, 'Julio-Diciembre');
insert into periodopasantialarga values (4, 'Octubre-Febrero');

