package com.caito.universidadbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String street;
    private String number;
    private String postalCode;
    private String depto;
    private String floor;
    private String location;
}
