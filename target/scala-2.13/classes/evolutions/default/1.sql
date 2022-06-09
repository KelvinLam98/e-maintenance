# --- !Ups
create table `users` (
  `id` bigint(20) not null auto_increment,
  `username` varchar(100) not null,
  `password` varchar(100) not null,
  `name` varchar(100) not null,
  `ic_number` varchar(100) not null,
  `contact_number` varchar(100) not null,
  `address` varchar(200) not null,
  `email` varchar(200) not null,
  `role` varchar(30) not null,
  `created` datetime not null,
  `modified` datetime not null,
  primary key (`id`)
);
insert into users (id, username, password, name, ic_number, contact_number, address, email, role, created, modified)
values (1, "admin", "admin", "admin", "901225015528", "0128877888", "address", "admin@gmail.com", "admin", now(), now());

create table `maintenance_item` (
  `id` bigint(20) not null auto_increment,
  `item_code` varchar(100) not null,
  `item_name` varchar(100) not null,
  primary key (`id`)
);

create table `work_order` (
  `id` bigint(20) not null auto_increment,
  `maintenance_id` bigint(20) not null,
  `technician_id` bigint(20) not null,
  `user_id` bigint(20) not null,
  `maintenance_date` date not null,
  `maintenance_time` varchar(100) not null,
  `status` varchar(100) not null,
  primary key (`id`)
);

create table `technician` (
  `id` bigint(20) not null auto_increment,
  `name` varchar(100) not null,
  `contact_number` varchar(100) not null,
  primary key (`id`)
);

create view `work_order_view` as
select
wo.id,
wo.user_id,
wo.maintenance_id,
wo.maintenance_date,
wo.maintenance_time,
wo.status,
wo.technician_id,
t.name as technician_name,
t.contact_number as technician_contact,
mi.item_code,
mi.item_name,
u.name as user_name,
u.contact_number as user_contact
from work_order wo
inner join technician t on (t.id = wo.technician_id)
inner join maintenance_item mi on (mi.id = wo.maintenance_id)
inner join users u on (u.id = wo.maintenance_id);

# --- !Downs
drop view `work_order_view`;
drop table `users`;
drop table `maintenance_item`;
drop table `work_order`;
drop table `technician`;
