package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "datosPokemon")
public class PokemonData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "datosId")
    private int dataId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "altura")
    private Double height;
    @Column(name = "peso")
    private Double weight;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "cargaAtaque")
    private int attackCharges;
    @Column(name = "tipoId")
    private int typeId;
    @Column(name = "prioridad")
    private int priority;
    @Column(name = "evolucion")
    private boolean evolution;



}