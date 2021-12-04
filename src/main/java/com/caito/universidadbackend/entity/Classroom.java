package com.caito.universidadbackend.entity;

import com.caito.universidadbackend.models.enums.BlackboardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "classrooms")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Classroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer nroClassroom;
    private String measures;
    private String numOfDesks;
    @Enumerated(EnumType.STRING)
    private BlackboardType blackboard;
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
    @ManyToOne(
            optional = true,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinColumn(name = "pavillon_id", foreignKey = @ForeignKey(name = "FK_PAVILLON_ID"))
    private Pavillon pavillon;
}
