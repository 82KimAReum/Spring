
CREATE TABLE world.Users ( 
username VARCHAR(20), 
password VARCHAR(20) NOT NULL, 
enabled tinyint(1) DEFAULT 1 , 
CONSTRAINT users_username_pk PRIMARY KEY (username) 
);

CREATE TABLE world.User_roles ( 
user_role_id tinyint(4), 
username VARCHAR(45), 
role VARCHAR(45) NOT NULL, 
CONSTRAINT user_roles_id PRIMARY KEY (user_role_id), 
CONSTRAINT user_roles_uk UNIQUE (role,username),
CONSTRAINT user_roles_fk FOREIGN KEY (username) REFERENCES users (username)
);

drop table world.users;
drop table world.user_roles;

INSERT INTO world.Users(username,password,enabled) VALUES ('javaexpert','12345678', 1);
INSERT INTO world.users(username,password,enabled) VALUES ('alex','12345678', 1);
INSERT INTO world.user_roles (user_role_id, username, role) 
VALUES (1, 'javaexpert', 'ROLE_USER');
INSERT INTO world.User_roles (user_role_id, username, role) 
VALUES (2, 'javaexpert', 'ROLE_ADMIN');

INSERT INTO world.User_roles (user_role_id, username, role) 
VALUES (3, 'alex', 'ROLE_USER');
