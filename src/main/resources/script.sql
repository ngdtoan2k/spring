CREATE TABLE userstable
(
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(500) NOT NULL,
    enabled  BOOLEAN      NOT NULL
);
CREATE TABLE authorities
(
    id SERIAL PRIMARY KEY ,
    username VARCHAR(50) NOT NULL ,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES userstable(username) ON DELETE CASCADE
);
CREATE TABLE customer
(
    id SERIAL PRIMARY KEY ,
    username VARCHAR(50) NOT NULL ,
    password VARCHAR(500) NOT NULL,
    role VARCHAR(50) NOT NULL 
);
insert into customer (id, username, password, role) values (1,"toan","123456","admin");