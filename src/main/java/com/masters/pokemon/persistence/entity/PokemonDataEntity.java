package com.masters.pokemon.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "datosPokemon")
public class PokemonDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "datosId")
    private String dataId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "altura")
    private Double height;
    @Column(name = "peso")
    private Double weight;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "prioridad")
    private int priority;
    @Column(name = "evolucion")
    private boolean evolution;

    @OneToMany(mappedBy = "pokemonDataEntity")
    private List<PokemonDataEntity> estadisticasPokemon;

    @OneToMany(mappedBy = "pokemonData")
    private List<PokemonDataEntity> tipo;


}