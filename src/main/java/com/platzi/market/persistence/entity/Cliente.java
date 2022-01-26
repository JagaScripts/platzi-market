package com.platzi.market.persistence.entity;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Integer celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

}
