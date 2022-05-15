create table usuarios
(
    id     int not null auto_increment,
    nombre varchar(45) default null,
    constraint pk_usuarios primary key (id)
);

insert into usuarios (nombre)
values ('RIVERO ALICIA'),
       ('RIOS MARIA TERESA'),
       ('EX SCIOSCIA NATALIN'),
       ('GIRARD GABRIEL'),
       ('GOYENA JAVIER'),
       ('GISELLE GABRIELE'),
       ('CONTRERAS MARCELA'),
       ('ARIAS MARCELA'),
       ('KARINA'),
       ('MKT VANESA'),
       ('MAP'),
       ('EX ROLON ROCIO'),
       ('PERELLI CINTHIA');

