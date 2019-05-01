drop table if exists city;

create table city (
    id                  uuid not null,
    city_name           text not null,
    coordinates         point not null,
    primary key(id)
);
