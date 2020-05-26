
create table user_table(
   id int not null auto_increment primary key,
   user_name varchar(50),
   password varchar(255),
   roles varchar(50)
);