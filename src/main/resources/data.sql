insert into User (username,password) values ('Tian','1234');
insert into User (username,password) values ('Macy','1234');
insert into User (username,password) values ('Zack','1234');

insert into Fortune (user_id, message, date) values (1, 'Testing123', current_timestamp);
insert into Fortune (user_id, message, date) values (2, 'Testing2', current_timestamp);
insert into Fortune (user_id, message, date) values (3, 'Testing3', current_timestamp);
insert into Fortune (user_id,message) values (1,'sent a message to Tian');
insert into Fortune (user_id,message) values (2,'sent a message to Macy');
insert into Fortune (user_id,message) values (3,'sent a message to Zack');

