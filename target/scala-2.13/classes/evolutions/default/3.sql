# --- !Ups
create table `work_order_sample` (
  `id` bigint(20) not null auto_increment,
  `maintenance_id` bigint(20) not null,
  `technician_id` bigint(20) not null,
  `status` varchar(100) not null,
  primary key (`id`)
);

create view `work_order_sample_view` as
select
wos.id,
wos.status,
t.name as technician_name,
t.contact_number as technician_contact,
mi.item_code,
mi.item_name
from work_order_sample wos
inner join technician t on (t.id = wos.technician_id)
inner join maintenance_item mi on (mi.id = wos.maintenance_id);

# --- !Downs
drop view `work_order_sample_view`;
drop table `work_order_sample`;
