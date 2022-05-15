drop table if exists lineas;

create table lineas
(
    id      int not null auto_increment,
    id_plan int not null,
    numero  varchar(45),
    constraint pk_lineas primary key (id),
    constraint fk_id_plan foreign key (id_plan) references planes (id)
);

insert into lineas(numero, id_plan)
values ('1151615361', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1151653819', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1151655430', (select id from planes where nombre = 'COMUNIDAD 5GB II')),
       ('1151657653', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1153276861', (select id from planes where nombre = 'COMUNIDAD 30GB')),
       ('1140472441', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1150472566', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1140472674', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1150876318', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1540428233', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1540428253', (select id from planes where nombre = 'COMUNIDAD 5GB II')),
       ('1540428338', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1540428445', (select id from planes where nombre = 'COMUNIDAD 12GB')),
       ('1540428572', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1540428586', (select id from planes where nombre = 'COMUNIDAD 5GB')),
       ('1541708803', (select id from planes where nombre = 'COMUNIDAD 5GB'));