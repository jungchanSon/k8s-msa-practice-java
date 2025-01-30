CREATE DATABASE dev;

USE dev;

create table if not exists users
(
    user_id  bigint       not null
    primary key,
    role     varchar(50)  not null,
    email    varchar(255) not null,
    password varchar(255) null,
    salt     varchar(255) not null,
    reg_date datetime     not null
    );

create table if not exists user_profile
(
    profile_id   bigint       not null
    primary key,
    user_id      bigint       not null,
    profile_name varchar(255) not null,
    profile_role varchar(50)  not null,
    phone_number varchar(50)  not null,
    profile_pass varchar(10)  null,
    reg_date     datetime     not null,
    constraint user_profile_fk
    foreign key (user_id) references users (user_id)
    on update cascade on delete cascade
    );