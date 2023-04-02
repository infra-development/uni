show tables;

drop table student;

CREATE TABLE `student` (`student_id` int NOT NULL AUTO_INCREMENT,
                        `student_name` varchar(255) NOT NULL,
                        `city` varchar(255) DEFAULT NULL,
                        `birth_date` datetime DEFAULT NULL,
                        PRIMARY KEY (`student_id`)
                       );

ALTER TABLE student MODIFY COLUMN student_id INT NOT NULL DEFAULT 0;

insert into student (`student_id`, `student_name`, `city`, `birth_date`) values (1, 'Haresh', 'Surat', '1989-01-22')
select * from student;
truncate table student;
