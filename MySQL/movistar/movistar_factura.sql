create table factura
(
    id                int         not null auto_increment,
    fecha_vencimiento date        not null,
    monto_total       double      not null,
    punto_venta       varchar(20) not null,
    numero_factura    int         not null,
    constraint pk_factura primary key (id),
    constraint uc_factura unique (numero_factura)
);

insert into factura (fecha_vencimiento, monto_total, punto_venta, numero_factura)
values (date('2022-05-16'), 26243.50, '2470', 637018)