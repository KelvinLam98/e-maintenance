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
  `maintenance_name` varchar(100) not null,
  `maintenance_date` date not null,
  `status` varchar(100) not null,
  primary key (`id`)
);

# --- !Downs
drop table `users`;
drop table `maintenance_item`;
drop table `work_order`;
