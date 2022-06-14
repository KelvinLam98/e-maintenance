# --- !Ups
create table `user_push_notif_tokens` (
  `id` bigint(20) not null auto_increment,
  `user_id` bigint(20) not null,
  `push_token` varchar(255) not null,
  `token_os` varchar(20) not null,
  `raw_token` varchar(255) null,
  PRIMARY KEY (`id`),
  UNIQUE KEY `notif_token_user_app_middleware_os_unique` (`user_id`, `token_os`),
  constraint `user_push_notif_tokens_user_id_FK`
		foreign key (`user_id`)
        references users (`id`)
        on delete restrict
        on update cascade
);

# --- !Downs
drop table `user_push_notif_tokens`;
