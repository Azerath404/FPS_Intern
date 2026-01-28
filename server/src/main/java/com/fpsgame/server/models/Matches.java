package com.fpsgame.server.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;

@Entity
@Table(name = "matches")
@Data
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "map_name")
    private String mapName;

    @Column(name = "duration_seconds")
    private Integer durationSeconds;

    @Column(name = "game_mode")
    private String gameMode;

    @Column(name = "played_at")
    private OffsetDateTime playedAt;
}
