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

create table `maintenance_item` (
  `id` bigint(20) not null auto_increment,
  `item_code` varchar(100) not null,
  `item_name` varchar(100) not null,
  primary key (`id`)
);

create table `work_order` (
  `id` bigint(20) not null auto_increment,
  `person_in_charge` varchar(100) not null,
  `technician_id` bigint(20) not null,
  `maintenance_name` varchar(100) not null,
  `maintenance_date` datetime not null,
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
wo.person_in_charge,
wo.maintenance_name,
wo.maintenance_date,
wo.status,
wo.technician_id,
t.name,
t.contact_number
from work_order wo
inner join technician t on (t.id = wo.technician_id);

# --- !Downs
drop table `users`;
drop table `maintenance_item`;
drop table `work_order`;
drop table `technician`;
drop view `work_order_view`;
