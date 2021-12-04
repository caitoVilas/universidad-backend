package com.caito.universidadbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pupils")
@PrimaryKeyJoinColumn(name = "person_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pupil extends Person{
    @ManyToOne(
            optional = true,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "career_id")
    private Career career;
}
