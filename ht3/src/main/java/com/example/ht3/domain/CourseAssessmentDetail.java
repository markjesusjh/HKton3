
package com.example.ht3.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "courseassessmentdetails")
public class CourseAssessmentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String score;
    private String section;

    OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
