package com.caito.universidadbackend.entity;

import com.caito.universidadbackend.models.enums.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "person_id")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee extends Person{
    private BigDecimal salary;
    @Enumerated(EnumType.STRING)
    private EmployeeType employeetype;
    @OneToOne(
            optional = true,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "pavillon_id", foreignKey = @ForeignKey(name = "FK_PAVILLON_ID2"))
    private Pavillon pavillon;
}
