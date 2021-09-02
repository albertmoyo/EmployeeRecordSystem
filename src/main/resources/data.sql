DROP TABLE IF EXISTS employee CASCADE;
CREATE TABLE employee
(
    employee_id          serial PRIMARY KEY NOT NULL ,
    first_name           character varying,
    middle_name          character varying,
    last_name            character varying,
    date_of_joining       DATE,
    date_of_exit          DATE,
    status              INTEGER
);


DROP TABLE IF EXISTS rolemaster CASCADE;
CREATE TABLE rolemaster
(
    id          serial PRIMARY KEY NOT NULL,
    role_name    character varying  NOT NULL,
    status      INTEGER
);

DROP TABLE IF EXISTS employeerolemapping CASCADE;
CREATE TABLE employeerolemapping
(
  employee_id INTEGER,
  role_id INTEGER,
  effective_date date,

  CONSTRAINT fk_employeeId foreign key (employee_id) references employee(employee_id),
  CONSTRAINT fk_id foreign key (role_id) references rolemaster(id)
);

insert into employee (employee_id, first_name, middle_name, last_name, date_of_joining, date_of_exit, status) values
(1, 'Albert', 'J', 'Moyo', TIMESTAMP '2021-05-12 10:59:23.002057', TIMESTAMP '2021-09-12 10:59:23.002057', 1),
(2, 'AJ', 'J', 'Moyo', TIMESTAMP '2021-05-12 10:59:23.002057', TIMESTAMP '2021-09-12 10:59:23.002057', 1);

insert into rolemaster (id, role_name, status) values
(1, 'Admin', 1),
(2, 'Devops', 1),
(3, 'Tester', 1),
(4, 'Guest', 1);

insert into employeerolemapping values
(1, 1, TIMESTAMP '2021-05-10 10:59:23.002057'),
(2, 1, TIMESTAMP '2021-05-10 10:59:23.002057'),
(1, 1, TIMESTAMP '2021-05-10 10:59:23.002057');
