DROP DATABASE IF EXISTS lesson_12;
CREATE DATABASE lesson_12;
USE lesson_12;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id                INT PRIMARY KEY AUTO_INCREMENT,
                       full_name         VARCHAR(50)  NOT NULL ,
                       email             VARCHAR(50)  UNIQUE KEY NOT NULL,
                       password          VARCHAR(50)  NOT NULL DEFAULT '123456Q',
                       project_id        INT          NOT NULL,
                       pro_skill         VARCHAR(50)  ,
                       exp_in_year       INT

);
INSERT INTO users(full_name         , email                , password , project_id , pro_skill , exp_in_year)
    VALUE            ('vo quang thong'  , 'thong.vq@gmail.com' , '123456Q', 2          , 'java'    , 5          ),
				 ('phan quang thanh', 'thanh.pq@gmail.com' , '123456Q', 4          , 'C++'     , NULL       ),
                 ('vu duc manh'     , 'manh.vd@gmail.com ' , '123456Q', 6          , NULL      , 3          );

DROP PROCEDURE IF EXISTS find_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_by_email_and_password (
    IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50)
)
BEGIN
SELECT *
FROM users
WHERE email = in_email AND password = in_password;
END $$
DELIMITER ;