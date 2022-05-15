create table planes
(
    id       int not null auto_increment,
    nombre   varchar(45) default null,
    precio   double      default null,
    internet varchar(45) default null,
    minutos  varchar(45) default null,
    sms      varchar(45) default null,
    constraint pk_planes primary key (id)
);

insert into planes(nombre, precio, internet, minutos, sms)
values ('COMUNIDAD 12GB', 2912, '12GB', '10000', '5000'),
       ('COMUNIDAD 30GB', 3379.75, '30GB', '10000', '5000'),
       ('COMUNIDAD 5GB', 965, '5GB', '10000', '5000'),
       ('COMUNIDAD 5GB II', 772, '5GB', '10000', '5000');