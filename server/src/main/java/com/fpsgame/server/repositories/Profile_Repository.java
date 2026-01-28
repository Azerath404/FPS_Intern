package com.fpsgame.server.repositories;

import com.fpsgame.server.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Profile_Repository extends JpaRepository<Profile, Long> {
    
}
