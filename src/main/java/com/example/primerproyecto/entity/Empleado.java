package com.example.primerproyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    @Id
    @Column(nullable = false)
    Long id;

    @Column(length = 50)
    String nombre;

    int edad;


    public Empleado(String nombre) {
        this.nombre = nombre;

    }
}
