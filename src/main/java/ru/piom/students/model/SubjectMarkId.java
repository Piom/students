package ru.piom.students.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubjectMarkId implements Serializable {
    @Column(name = "student_id")
    Long studentId;
    @Column(name = "subject_id")
    Long subjectId;
}
