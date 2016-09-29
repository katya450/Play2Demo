# --- !Ups

create table item (
  id                            bigserial not null,
  name                          varchar(30) not null,
  amount                        varchar(20),
  constraint pk_item primary key (id)
);


# --- !Downs

drop table if exists item cascade;

