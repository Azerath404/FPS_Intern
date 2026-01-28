package com.fpsgame.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpsgame.server.repositories.Profile_Repository;
import com.fpsgame.server.models.Profile;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class Profile_Controller {
    @Autowired
    private Profile_Repository profileRepository;

    @GetMapping
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }
}
