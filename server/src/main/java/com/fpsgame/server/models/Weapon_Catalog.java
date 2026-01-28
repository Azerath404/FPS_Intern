package com.fpsgame.server.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "weapon_catalog")
@Data
public class Weapon_Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String category;

    @Column(name = "sub_type")
    private String subType;

    @Column(name = "base_damage")
    private Integer baseDamage;

    @Column(name = "image_url")
    private String imageUrl;
}