package com.caito.universidadbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "person_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher extends Person{
    private BigDecimal salary;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(name = "teacher_career", joinColumns = @JoinColumn(name = "teacher_id"),
    inverseJoinColumns = @JoinColumn(name = "career_id"))
    private Set<Career> careers;
}
