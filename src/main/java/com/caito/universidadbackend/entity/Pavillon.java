package com.caito.universidadbackend.entity;

import com.caito.universidadbackend.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "pavillons")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pavillon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mts2;
    @Column(nullable = false, unique = true)
    private String name;
    @Embedded
    private Address address;
    private LocalDateTime created;
    private LocalDateTime updated;
    @OneToMany(
            mappedBy = "pavillon",
            fetch = FetchType.LAZY
    )
    private Set<Classroom> classrooms;
}
