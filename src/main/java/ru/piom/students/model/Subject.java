package ru.piom.students.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    @OneToMany(mappedBy = "subject")
    Set<SubjectMark> marks;

    private String title;
}
