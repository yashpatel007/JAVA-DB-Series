/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Yash Patel
 * Created: Apr 26, 2020
 * We are working with hybernate and it uses ORM so no need to create table will be handeled by SPRING
 */
-- 
-- CREATE TABLE todo (
--     id int NOT NULL,
--     title varchar(225),
--     description varchar(255),
--     status int,
--     PRIMARY KEY (id)
-- );

-- INSERT INTO todo (id,title,description,status) VALUES(1,"Hello world", "compllete an api", 0);

INSERT INTO todo (title,description,status) VALUES('Hello world', 'complete an api', 0);
INSERT INTO todo (title,description,status) VALUES('Read Tolkin', 'RR tolkin writes awesome stories', 0);
INSERT INTO todo (title,description,status) VALUES('Hakuna matana', 'It means no worries for the rest of your days', 1);
INSERT INTO todo (title,description,status) VALUES('Get Masks', 'Corona Virus is Lurking out there', 0);
INSERT INTO todo (title,description,status) VALUES('Learn Java', 'Java is Awesome', 1);
INSERT INTO todo (title,description,status) VALUES('Learn Python', 'Python is Dope', 1);
--COMMIT;