package com.example.primerproyecto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String apellido;


}
