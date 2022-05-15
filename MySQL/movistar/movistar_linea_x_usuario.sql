drop table if exists linea_x_usuario;

create table linea_x_usuario
(
    id         int not null auto_increment,
    id_usuario int default null,
    id_linea   int default null,
    id_equipo  int default null,
    id_plan    int default null,
    primary key (id),
    key id_linea_idx (id_linea),
    key id_usuario_idx (id_usuario),
    key id_plan_idx (id_plan),
    key id_equipo_idx (id_equipo),
    constraint id_equipo foreign key (id_equipo) references equipos (id),
    constraint id_linea foreign key (id_linea) references lineas (id),
    constraint id_plan foreign key (id_plan) references planes (id),
    constraint id_usuario foreign key (id_usuario) references usuarios (id)
);

SELECT
    nombre,
    COUNT(nombre)
FROM
    usuarios
GROUP BY nombre
HAVING COUNT(nombre) > 1;

insert into linea_x_usuario (id_usuario, id_linea, id_equipo, id_plan)
values ((select id from usuarios where nombre = 'RIVERO ALICIA'),
        (select id from lineas where numero = '1151615361'),
        (select id from equipos where imei_trafica = '358008303736376'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'RIOS MARIA TERESA'),
        (select id from lineas where numero = '1151653819'),
        (select id from equipos where imei_registrado = '358678077268226'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'EX SCIOSCIA NATALIN'),
        (select id from lineas where numero = '1151655430'),
        (select id from equipos where imei_registrado = '358991062031032'),
        (select id from planes where nombre = 'COMUNIDAD 5GB II')),

       ((select id from usuarios where nombre = 'GIRARD GABRIEL'),
        (select id from lineas where numero = '1151657653'),
        (select id from equipos where imei_registrado = '358008303662200'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'GOYENA JAVIER'),
        (select id from lineas where numero = '1153276861'),
        (select id from equipos where imei_registrado = '353576111350528'),
        (select id from planes where nombre = 'COMUNIDAD 30GB')),

       ((select id from usuarios where nombre = 'GISELLE GABRIELE'),
        (select id from lineas where numero = '1140472441'),
        (select id from equipos where imei_registrado = '358678078321347'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'CONTRERAS MARCELA'),
        (select id from lineas where numero = '1150472566'),
        (select id from equipos where imei_registrado = '352940099168776'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'ARIAS MARCELA'),
        (select id from lineas where numero = '1140472674'),
        (select id from equipos where imei_registrado = '355924409131531'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'KARINA'),
        (select id from lineas where numero = '1150876318'),
        (select id from equipos where imei_registrado = '357809931656113'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'MKT VANESA'),
        (select id from lineas where numero = '1540428233'),
        (select id from equipos where imei_registrado = '359931074644983'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'ARIAS MARCELA'),
        (select id from lineas where numero = '1540428253'),
        (select id from equipos where imei_registrado = '359978090210141'),
        (select id from planes where nombre = 'COMUNIDAD 5GB II')),

       ((select id from usuarios where nombre = 'MAP'),
        (select id from lineas where numero = '1540428338'),
        (select id from equipos where imei_registrado = '359705081172620'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'MAP'),
        (select id from lineas where numero = '1540428445'),
        (select id from equipos where imei_registrado = '357647100195087'),
        (select id from planes where nombre = 'COMUNIDAD 12GB')),

       ((select id from usuarios where nombre = 'ARIAS MARCELA'),
        (select id from lineas where numero = '1540428572'),
        (select id from equipos where imei_registrado = '352940097699871'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'EX ROLON ROCIO'),
        (select id from lineas where numero = '1540428586'),
        (select id from equipos where imei_registrado = '353256482133569'),
        (select id from planes where nombre = 'COMUNIDAD 5GB')),

       ((select id from usuarios where nombre = 'PERELLI CINTHIA'),
        (select id from lineas where numero = '1541708803'),
        (select id from equipos where imei_registrado = '352825094524075'),
        (select id from planes where nombre = 'COMUNIDAD 5GB'))