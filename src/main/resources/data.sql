insert into User (username,password) values ('Tian','1234');
insert into User (username,password) values ('Macy','1234');
insert into User (username,password) values ('Zack','1234');

insert into Fortune ( user_id, message, date) values (1, 'Testing123', current_timestamp);
insert into Fortune ( message, date) values ( 'Testing2', current_timestamp);
insert into Fortune ( message, date) values ( 'Testing3', current_timestamp);
insert into Fortune (message, date) values ('sent a message to Tian', current_timestamp);
insert into Fortune (message, date) values ('sent a message to Macy', current_timestamp);
insert into Fortune (message, date) values ('sent a message to Zack', current_timestamp);

