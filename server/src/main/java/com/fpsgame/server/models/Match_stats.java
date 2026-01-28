package com.fpsgame.server.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "match_stats")
@Data
public class Match_stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_id")
    private Long matchId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "player_name")
    private String playerName;

    private Integer kills = 0;
    private Integer deaths = 0;
    private Integer assists = 0;

    @Column(name = "kda_ratio")
    private String kdaRatio;
}
