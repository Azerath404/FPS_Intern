package com.fpsgame.server.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;

@Entity
@Table(name = "profiles")
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private Integer level=1;
    private Long exp = 0L;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;
}
