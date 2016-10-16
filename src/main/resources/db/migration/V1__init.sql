CREATE TABLE CONTACT (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(255) not null,
  phone_number VARCHAR(255) not null
);

insert into CONTACT (name, phone_number) values ('Tom', '1-202-555-1212');
insert into CONTACT (name, phone_number) values ('Dick', '1-900-OHH-YISS');
insert into CONTACT (name, phone_number) values ('Harry', '1-800-BIG-GUNZ');