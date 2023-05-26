create table comment (
    removed boolean not null,
    comment_id bigint,
    created_at timestamp(6),
    id bigserial not null,
    updated_at timestamp(6),
    text varchar(255),
    primary key (id));
create table contractor (
    removed boolean not null,
    created_at timestamp(6),
    id bigserial not null,
    updated_at timestamp(6),
    country varchar(255),
    email varchar(255),
    first_name varchar(255),
    last_name varchar(255),
    patronymic varchar(255),
    phone varchar(255),
    telegram varchar(255),
    primary key (id));
create table credential (
    removed boolean not null,
    created_at timestamp(6),
    id bigserial not null,
    updated_at timestamp(6),
    text varchar(255),
    type_of_contractor varchar(255) check (type_of_contractor in ('INDIVIDUAL','ENTITY')),
    version varchar(255),
    primary key (id));
create table doc_field (
    removed boolean not null,
    created_at timestamp(6),
    document_id bigint,
    id bigserial not null,
    updated_at timestamp(6),
    default_value varchar(255),
    name varchar(255),
    placeholder varchar(255),
    type varchar(255),
    primary key (id));
create table doc_file (
    removed boolean not null,
    created_at timestamp(6),
    id bigserial not null,
    size bigint,
    updated_at timestamp(6),
    description varchar(255),
    mimetype varchar(255) check (mimetype in ('ZIP','PDF','WORD','EXCEL')),
    name varchar(255),
    store varchar(255),
    primary key (id));
create table doc_related (removed boolean not null, created_at timestamp(6), id bigserial not null, related_id bigint, updated_at timestamp(6), primary key (id));
create table doc_template (doc_title smallint check (doc_title between 0 and 4), removed boolean not null, created_at timestamp(6), id bigserial not null, updated_at timestamp(6), title varchar(255), version varchar(255), primary key (id));
create table document (
    doc_title smallint check (doc_title between 0 and 4),
    removed boolean not null, created_at timestamp(6),
    file_id bigint unique, id bigserial not null,
    template_id bigint unique,
    updated_at timestamp(6),
    number varchar(255),
    primary key (id));
alter table if exists comment add constraint FKa9f0t6pgho5yeges204ofrcg foreign key (comment_id) references contractor;
alter table if exists doc_field add constraint FK1hjas916sas2836h77mc4g7c1 foreign key (document_id) references document;
alter table if exists document add constraint FKdi4epn0dyux92joqp5bj8lomo foreign key (file_id) references doc_file;
alter table if exists document add constraint FK8cpt33nbbttgfu5bdhjoys9ak foreign key (template_id) references doc_template;