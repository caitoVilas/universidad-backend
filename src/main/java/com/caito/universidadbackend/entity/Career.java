package com.caito.universidadbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "careers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Career implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 80)
    private String name;
    private Integer numOfCourse;
    private Integer numOfYears;
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
    @OneToMany(
            mappedBy = "career",
            fetch = FetchType.LAZY
    )
    private Set<Pupil> pupils;
    @ManyToMany(
            mappedBy = "careers",
            fetch = FetchType.LAZY
    )
    private Set<Teacher> teachers;
}
