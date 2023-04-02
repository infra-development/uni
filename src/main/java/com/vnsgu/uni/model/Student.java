package com.vnsgu.uni.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student implements Serializable, Comparable<Student> {

    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "city")
    private String city;

    @Column(name = "birth_date", columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @Builder
    public Student(Long studentId,
                   String studentName,
                   String city,
                   Date birthDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDate = birthDate;
        this.city = city;
    }

    @Override
    public int compareTo(Student student) {
        if(this.studentId != null) {
            return this.studentId.compareTo(student.studentId);
        } else {
            return 0;
        }

    }
}
