show tables;

drop table student;

CREATE TABLE `student` (`student_id` int NOT NULL,
                        `student_name` varchar(255) NOT NULL,
                        `city` varchar(255) DEFAULT NULL,
                        `birth_date` datetime DEFAULT NULL,
                        PRIMARY KEY (`student_id`)
                       );

select * from student;