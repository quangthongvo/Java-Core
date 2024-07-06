DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id                INT PRIMARY KEY AUTO_INCREMENT,
                       full_name         VARCHAR(50)  NOT NULL ,
                       email             VARCHAR(50)  UNIQUE KEY NOT NULL,
                       password          VARCHAR(50)  NOT NULL DEFAULT '123456Q',
                       project_id        INT          NOT NULL,
                       pro_skill         VARCHAR(50)  ,
                       role              ENUM('EMPLOYEE','MANAGER') NOT NULL DEFAULT 'EMPLOYEE',
                       exp_in_year       INT

);
INSERT INTO users(full_name         , email                    , password  , project_id , pro_skill,role      , exp_in_year)
VALUE            ('vo Quang Thong'  , 'thong02@gmail.com'      , '123456Q' , 1          , 'java'   ,'MANAGER' , 5          ),
				 ('Phan Quang Thanh', 'thanhphan@gmail.com'    , '123456Q' , 1          , 'C++'    ,'EMPLOYEE', NULL       ),
                 ('Vu Duc Manh'     , 'manhdeptrai@gmail.com ' , '123456Q' , 1          , NULL     ,'EMPLOYEE', 3          ),
                 ('Doan Duc Long'   , 'longdoan21@@gmail.com'  , '123456Q' , 1          , NULL     ,'EMPLOYEE', NULL       );

DROP PROCEDURE IF EXISTS find_manger_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_manager_by_email_and_password (
    IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50)
)
BEGIN
SELECT *
FROM users
WHERE role = "MANAGER" AND email = in_email AND password = in_password;
END $$
DELIMITER ;

