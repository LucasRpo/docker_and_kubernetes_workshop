create schema if not exists containerRDS collate utf8mb4_0900_ai_ci;

create table if not exists cuenta
(
    id bigint auto_increment
    primary key,
    numero_cuenta varchar(255) null,
    tipo_cuenta varchar(255) null
    );

create table if not exists cliente_banco
(
    id bigint auto_increment
    primary key,
    cedula varchar(255) null,
    primer_apellido varchar(255) null,
    primer_nombre varchar(255) null,
    ct_id bigint null,
    constraint FKsnybk80rnq2b8wugcbdg7k6tj
    foreign key (ct_id) references cuenta (id)
    );