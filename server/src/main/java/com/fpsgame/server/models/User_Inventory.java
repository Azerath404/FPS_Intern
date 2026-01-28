package com.fpsgame.server.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;

@Entity
@Table(name = "user_inventory")
@Data
public class User_Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "primary_weapon_id")
    private Long primaryWeaponId;

    @Column(name = "secondary_weapon_id")
    private Long secondaryWeaponId;

    @Column(name = "melee_weapon_id")
    private Long meleeWeaponId;

    @Column(name = "grenade_id")
    private Long grenadeId;

    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;
}