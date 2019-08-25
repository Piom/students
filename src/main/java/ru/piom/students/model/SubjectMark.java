package ru.piom.students.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SubjectMark {

    @EmbeddedId
    SubjectMarkId id;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("subject_id")
    @JoinColumn(name = "subject_id")
    Subject subject;

    int mark;
}
