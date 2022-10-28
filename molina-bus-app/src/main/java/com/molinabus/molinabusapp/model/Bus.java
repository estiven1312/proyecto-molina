package com.molinabus.molinabusapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
