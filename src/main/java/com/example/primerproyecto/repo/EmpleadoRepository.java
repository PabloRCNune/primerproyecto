package com.example.primerproyecto.repo;

import com.example.primerproyecto.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

    public Empleado findByNombreIs(String nm);

    Empleado findByNombreIsAndEdadGreaterThan(String nombre, int edad);

    Empleado findByEdadBetweenAndNombreContaining(int edadAfter, int edadBefore,  String nombre);


    @Query("Select e from Empleado e where e.edad >= 18")
    Empleado consultadenombreextraño ();
}
