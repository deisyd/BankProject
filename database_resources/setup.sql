drop table if exists app_user cascade;
drop table if exists customer cascade;
drop table if exists employee cascade;
drop table if exists employees_customers cascade;

create table app_user(
	user_user text unique not null primary key,
	user_pass text not null,
	user_first text not null ,
	user_last text not null,
	customer_userid text unique not null,
	employee_userid text unique not null
);

create table customer(
	customer_user text not null primary key,
	customer_pass text not null,
	customer_first text not null,
	customer_last text not null,
	customer_age integer not null,
	customer_social integer unique not null,
	customer_email text unique not null,
	customer_phone text
);

create table employee(
	employee_user text unique not null,
	employee_pass text not null,
	employee_first text not null,
	employee_last text not null,
	employee_email text not null
);

alter table app_user add foreign key (customer_userid)
references customer(customer_user);

alter table app_user add foreign key (employee_userid)
references employee(employee_user);

create table if not exists employees_customers(
	customer_user text references customer(customer_user),
	employee_user text references employee(employee_user),
	primary key(customer_user, employee_user)
);